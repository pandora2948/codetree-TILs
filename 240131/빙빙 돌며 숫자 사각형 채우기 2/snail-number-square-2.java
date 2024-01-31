import java.util.*;

public class Main {
    public static boolean isInside(int x, int y, int n) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] tbl = new int[n][m];

        int[] dx = new int[] {0, 1, 0, -1};
        int[] dy = new int[] {1, 0, -1, 0};
        int d = 0;
        int x = 0, y = 0;
        int cnt = 1;

        while (cnt <= n * m) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            tbl[y][x] = cnt;
            cnt += 1;
            
            if (!isInside(nx, ny, n) || tbl[ny][nx] != 0) {
                d = (d + 1) % 4;
                nx = x + dx[d];
                ny = y + dy[d];
            }

            x = nx;
            y = ny;
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < m; j += 1) {
                System.out.printf("%d\t", tbl[i][j]);
            }
            System.out.println();
        }
    }
}