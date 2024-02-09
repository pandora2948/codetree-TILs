import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int MAX_POS = 101;
        int res = 0;
        char[] arr = new char[MAX_POS];

        for (int i = 0; i < MAX_POS; i += 1) {
            arr[i] = 'X';
        }

        for (int i = 0; i < n; i += 1) {
            int p = sc.nextInt();
            char c = sc.next().charAt(0);

            arr[p] = c;
        }

        for (int i = 0; i < MAX_POS; i += 1) {
            for (int j = i; j < MAX_POS; j += 1) {
                if (arr[i] == 'X' || arr[j] == 'X') continue;

                int gCount = 0;
                int hCount = 0;
                for (int k = i; k <= j; k += 1) {
                    if (arr[k] == 'G') {
                        gCount += 1;
                        continue;
                    }

                    if (arr[k] == 'H') {
                        hCount += 1;
                        continue;
                    }
                }

                if (gCount + hCount == 0) continue;

                if (gCount == hCount) {
                    res = Math.max(res, j - i);
                }

            }
        }

        System.out.println(res);
    }
}