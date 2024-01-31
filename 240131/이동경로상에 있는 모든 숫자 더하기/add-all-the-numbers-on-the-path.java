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
        int t = sc.nextInt();
        char[] q = sc.next().toCharArray();
        int[] dx = new int[] {0, 1, 0, -1};
        int[] dy = new int[] {-1, 0, 1, 0};
        int x = n / 2, y = n / 2;
        int d = 0;

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                tbl[i][j] = sc.nextInt();
            }
        }

        int sum = tbl[y][x];

        for (int i = 0; i < t; i += 1) {
            char task = q[i];

            if (task == 'L') {
                d = (d + 3) % 4;
                continue;
            }

            if (task == 'R') {
                d = (d + 1) % 4;
                continue;
            }

            int nx = x + dx[d];
            int ny = y + dy[d];

            if (isInside(nx, ny, n)) {
                x = nx;
                y = ny;
                sum += tbl[y][x];
            }
        }

        System.out.println(sum);
    }
}