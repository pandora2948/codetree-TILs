import java.util.*;

public class Main {
    public static boolean isAvailable(int x, int y, int n) {
        if (0 <= x && x < n && 0 <= y && y < n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        int[][] tbl = new int[n][n];
        int[] dx = new int[] {0, 1, 0, -1};
        int[] dy = new int[] {1, 0, -1, 0};

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                tbl[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                int cnt = 0;
                for (int k = 0; k < 4; k += 1) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (isAvailable(nx, ny, n) && tbl[nx][ny] == 1 && cnt < 3) {
                        cnt += 1;
                    }
                }
                if (cnt == 3) {
                    res += 1;
                }
            }
        }

        System.out.println(res);
        

    }
}