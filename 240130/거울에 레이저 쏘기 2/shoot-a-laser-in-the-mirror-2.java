import java.util.*;

public class Main {
    public static boolean isInside(int x, int y, int n) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int[][] tbl = new int[n][n];
        int[] dx = new int[] {1, 0, -1, 0};
        int[] dy = new int[] {0, -1, 0, 1};

        for (int i = 0; i < n; i += 1) {
        char[] line = sc.next().toCharArray();
            for (int j = 0; j < n; j += 1) {
                tbl[i][j] = line[j] == '/' ? -1 : 1;
            }
        }

        int k = sc.nextInt() - 1;
        int startD = k / n;
        int d = 0;
        int x = 0;
        int y = 0;

        switch (startD) {
            case 0:
                x = k % n;
                y = 0;
                d = 2;
                break;

            case 1:
                x = n - 1;
                y = k % n;
                d = 3;
                break;

            case 2:
                x = k % n;
                y = n - 1;
                d = 0;
                break;

            case 3:
                x = 0;
                y = (n - 1) - (k % n);
                d = 2;
                break;
        }

        while (isInside(x, y, n)) {
            cnt += 1;
            int cur = tbl[y][x];
            
            switch (d) {
                case 0:
                    x += cur == -1 ? 1 : -1;
                    d = cur == -1 ? 1 : 3;
                    break;

                case 1:
                    y += cur == -1 ? -1 : 1;
                    d = cur == -1 ? 0 : 2;
                    break;
                    
                case 2:
                    x += cur == -1 ? -1 : 1;
                    d = cur == -1 ? 3 : 1;
                    break;

                case 3:
                    y += cur == -1 ? 1 : -1;
                    d = cur == -1 ? 2 : 0;
                    break;
            }
        }
        System.out.println(cnt);
    }
}