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
        int timeA = 0;
        int timeB = 0;

        for (int i = 0; i < n; i += 1) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            for (int j = 0; j < t; j += 1) {
                timeA += 1;
                arrA[timeA] = d == 'L' ? arrA[timeA - 1] - 1 : arrA[timeA - 1] + 1;
            }
        }

        for (int i = 0; i < m; i += 1) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            for (int j = 0; j < t; j += 1) {
                timeB += 1;
                arrB[timeB] = d == 'L' ? arrB[timeB - 1] - 1 : arrB[timeB - 1] + 1;
            }
        }

        int minLen = Math.min(timeA, timeB);
        int maxLen = Math.max(timeA, timeB);

        for (int i = minLen; i <= maxLen; i += 1) {
            if (timeA > timeB) {
                arrB[i] = arrB[minLen];
                continue;
            }

            if (timeA < timeB) {
                arrA[i] = arrA[minLen];
                continue;
            }
        }

        for (int i = 1; i <= maxLen; i += 1) {
            if (arrA[i - 1] != arrB[i - 1] && arrA[i] == arrB[i]) {
                cnt += 1;
            }
        }

        System.out.println(cnt);

    }
}