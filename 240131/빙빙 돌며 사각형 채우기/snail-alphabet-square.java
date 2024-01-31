import java.util.*;

public class Main {
    public static boolean isInsdie(int x, int y, int n, int m) {
        return 0 <= x && x < m && 0 <= y && y < n;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        final int START_NUMBER = (int) 'A';
        final int LAST_NUMBER = (int) 'Z';
        int num = START_NUMBER;
        int[] dx = new int[] {0, 1, 0, -1};
        int[] dy = new int[] {-1, 0, 1, 0};
        int x = 0, y = 0;
        int d = 1;
        int[][] tbl = new int[n][m];

        for (int i = 0; i < n * m; i += 1) {
            tbl[y][x] = num;
            num = num + 1 > LAST_NUMBER ? START_NUMBER : num + 1;

            int nx = x + dx[d];
            int ny = y + dy[d];

            if (!isInsdie(nx, ny, n, m) || tbl[ny][nx] != 0) {
                d = (d + 1) % 4;
            }

            x += dx[d];
            y += dy[d];
        } 
            
        
        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < m; j += 1) {
                System.out.printf("%c ", (char) tbl[i][j]);
            }
            System.out.println();
        }
        
    }
}