import java.util.*;

public class Main {
    public static final int W = 19;
    public static final int D = 8;

    public static int[][] arr = new int[W][W];

    public static int[] dx = new int[] {0, 1, 1, 1, 0, -1, -1, -1};
    public static int[] dy = new int[] {1, 1, 0, -1, -1, -1, 0, 1};

    public static boolean isInside(int x, int y) {
        return 0 <= x && x < W && 0 <= y && y < W;
    }
    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < W; i += 1) {
            for (int j = 0; j < W; j += 1) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < W; i += 1) {
            for (int j = 0; j < W; j += 1) {
                int cur = arr[i][j];
                if (cur == 0) continue;

                for (int k = 0; k < D; k += 1){
                    boolean isWin = true;
                    for (int l = 0; l < 5; l += 1) {
                        int nx = j + (dx[k] * l);
                        int ny = i + (dy[k] * l);
                        isWin = isWin && isInside(nx, ny) && arr[ny][nx] == cur;
                    }
                    if (isWin) {
                        System.out.println(cur);
                        System.out.printf("%d %d", (i + 1 + dy[k] * 2), (j + 1 + dx[k] * 2));
                        return;
                    }
                }
            }
        }
        System.out.println(0);
        
    }
}