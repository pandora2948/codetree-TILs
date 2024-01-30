import java.util.*;

public class Main {
    public static boolean isInside(int x, int y, int n) {
        return 0 <= x && x < n &  0 <= y && y < n;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] tbl = new int[n][n];
        int[] dx = new int[] {0, 1, 0, -1};
        int[] dy = new int[] {-1, 0, 1, 0};

        for (int i = 0; i < m; i += 1) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            int cnt = 0;
            
            tbl[y][x] = 1;

            for (int j = 0; j < 4; j += 1) {
                int nx = x + dx[j];
                int ny = y + dy[j];

                if (isInside(nx, ny, n) && tbl[ny][nx] == 1) {
                    cnt += 1;
                }

            }

            System.out.println(cnt == 3 ? 1 : 0);
        }

    }
}