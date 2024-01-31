import java.util.*;

public class Main {
    public static boolean isInside(int x, int y, int n) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] tbl = new int[n][n];
        int x = n - 1;
        int y = n - 1;
        int d = 2;
        int[] dx = new int[] {1, 0, -1 , 0};
        int[] dy = new int[] {0, 1, 0, -1};
        int cnt = (int) Math.pow(n, 2);

        while (cnt > 0) {
            tbl[y][x] = cnt;
            cnt -= 1;

            int nx = x + dx[d];
            int ny = y + dy[d];
            if (!isInside(nx, ny, n) || tbl[ny][nx] != 0) {
                d = (d + 1) % 4;
            }
            
            x += dx[d];
            y += dy[d];
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                System.out.printf("%d ", tbl[i][j]);
            }
            System.out.println();
        }

    }
}