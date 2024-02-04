import java.util.*;

public class Main {
    public static boolean isInside(int x, int y, int n) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] res = new int[2];
        int[] except = new int[2];
        int[][] tbl = new int[n][n];

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                tbl[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                int cnt = 0;
                for (int k = 0; k < 3; k += 1) {
                    if (isInside(j + k, i, n) && tbl[i][j + k] == 1) {
                        cnt += 1;
                    }
                }
                if (cnt > res[0]) {
                    res[0] = cnt;
                    except[0] = i;
                    except[1] = j;
                }
            }
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                if (i == except[0] && j == except[1]) continue;

                int cnt = 0;
                for (int k = 0; k < 3; k += 1) {
                    if (isInside(j + k, i, n) && tbl[i][j + k] == 1) {
                        cnt += 1;
                    }
                }
                res[1] = Math.max(res[1], cnt);
            }
        }

        System.out.println(res[0] + res[1]);


    }
}