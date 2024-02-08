import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int MAX_POS = 101;
        int res = 0;
        char[] arr = new char[MAX_POS];

        for (int i = 0; i < n; i += 1) {
            int p = sc.nextInt();
            char c = sc.next().charAt(0);

            arr[p] = c;
        }

        for (int i = 0; i < MAX_POS; i += 1) {
            int gCount = 0;
            int hCount = 0;
            for (int j = 0; j < MAX_POS; j += 1) {
                if (i + j >= MAX_POS) break;

                if (arr[i + j] == 'G') {
                    gCount += 1;
                }

                if (arr[i + j] == 'H') {
                    hCount += 1;
                }

                if (gCount != 0 && gCount == hCount) {
                    res = Math.max(res, j - 1);
                    break;
                }
            }
        }
        System.out.println(res);
    }
}