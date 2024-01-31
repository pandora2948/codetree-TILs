import java.util.*;

public class Main {
    public static boolean isInside(int x, int y, int n, int m) {
        return 0 <= x && x < m && 0 <= y && y < n;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] tbl = new int[n][m];
        int x = 0, y = 0;
        int d = 0;
        int[] dx = new int[] {0, 1, 0, -1};
        int[] dy = new int[] {1, 0, -1, 0};
        int cnt = 1;

        while (cnt <= n * m) {
            tbl[y][x] = cnt;
            cnt += 1;

            int nx = x + dx[d];
            int ny = y + dy[d];

            if (!isInside(nx, ny, n, m) || tbl[ny][nx] != 0) {
                d = (d + 1) % 4;
            }

            x += dx[d];
            y += dy[d];
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < m; j += 1) {
                System.out.printf("%d\t", tbl[i][j]);
            }
            System.out.println();
        }
    }
}