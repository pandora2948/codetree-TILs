import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arrA = new int[n * 1000000 + 1];
        int[] arrB = new int[m * 1000000 + 1];
        int timeA = 1;
        int timeB = 1;

        for (int i = 0; i < n; i += 1) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            
            for (int j = 0; j < t; j += 1) {
                arrA[timeA] = arrA[timeA - 1] + v;
                timeA += 1;
            }
        }

        for (int i = 0; i < m; i += 1) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int j = 0; j < t; j += 1) {
                arrB[timeB] = arrB[timeB - 1] + v;
                timeB += 1;
            }
        }

        int bound = Math.max(timeA, timeB);
        int cnt = 0;
        int state = 2;
        int pos = 0;

        while (arrA[pos] == arrB[pos]) {
            pos += 1;
            if (arrA[pos] > arrB[pos]) {
                state = 0;
            }
            else if (arrA[pos] < arrB[pos]) {
                state = 1;
            }
        }

        for (int i = pos + 1; i <= bound; i += 1) {
            if (arrA[i] > arrB[i] && state == 1) {
                cnt += 1;
                state = 0;
                continue;
            }

            if (arrA[i] < arrB[i] && state == 0) {
                cnt += 1;
                state = 1;
                continue;
            }
        }

        System.out.println(cnt);
    }
}