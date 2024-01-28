import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arrA = new int[1000001];
        int[] arrB = new int[1000001];
        int cnt = 0;
        int timeA = 1;
        int timeB = 1;

        for (int i = 0; i < n; i += 1) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            for (int j = 0; j < t; j += 1) {
                arrA[timeA] = d == 'L' ? arrA[timeA - 1] - 1 : arrA[timeA - 1] + 1;
                timeA += 1;
            }
        }

        for (int i = 0; i < m; i += 1) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            for (int j = 0; j < t; j += 1) {
                arrB[timeB] = d == 'L' ? arrA[timeB - 1] - 1 : arrA[timeB - 1] + 1;
            }
        }

        int maxLen = Math.max(timeA, timeB);

        if (timeA > timeB) {
            for(int i = timeB; i <= timeA; i += 1) {
                arrB[i] = arrB[timeB];
            }
        }
        else if (timeA < timeB) {
            for (int i = timeA; i <= timeB; i += 1) {
                arrA[i] = arrA[timeA];
            }
        }

        for (int i = 2; i <= maxLen; i += 1) {
            if (arrA[i - 1] != arrB[i - 1] && arrA[i] == arrB[i]) {
                cnt += 1;
            }
        }

        System.out.println(cnt);

    }
}