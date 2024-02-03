import java.util.*;

public class Main {
    public static int n = 0;
    public static int m = 0;

    public static boolean isInside(int x, int y) {
        return 0 <= x && x < m && 0 <= y && y < n;
    }

    public static boolean checkLee(char c, int i) {
        return (i == 0 && c == 'L') || ((i == 1 || i == 2) && c == 'E');
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int cnt = 0;
        int[] dx = new int[] {0, 1, 1, 1, 0, -1, -1, -1};
        int[] dy = new int[] {-1, -1, 0, 1, 1, 1, 0 ,-1};

        char[][] tbl = new char[n][m];

        for (int i = 0; i < n; i += 1) {
            tbl[i] = sc.next().toCharArray();
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < m; j += 1) {
                for (int k = 0; k < 8; k += 1) {
                    boolean isLee = true;
                    for (int l = 0; l < 3; l += 1) {
                        int nx = j + (dx[k] * l);
                        int ny = i + (dy[k] * l);
                        
                        isLee = isLee && isInside(nx, ny) && checkLee(tbl[ny][nx], l);
                    }
                    if (isLee) {
                        cnt += 1;
                    }
                }
            }
        }

        System.out.println(cnt);



    }
}