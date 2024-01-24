import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] cord = new int[201][201];
        int POSITION = 100;
        int[] xBound = {200, 0};
        int[] yBound = {200, 0};
        int cnt = 0;

        for (int i = 0; i < n; i += 1) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            xBound[0] = Math.min(xBound[0], x + POSITION);
            xBound[1] = Math.max(xBound[1], x + POSITION + 8);
            yBound[0] = Math.min(yBound[0], y + POSITION);
            yBound[1] = Math.max(yBound[1], y + POSITION +8);

            for (int j = x; j < x + 8; j += 1) {
                for (int k = y; k < y + 8; k += 1) {
                    cord[POSITION + j][POSITION + k] = 1;
                }
            }
        }

        for (int i = xBound[0]; i <= xBound[1]; i += 1) {
            for (int j = yBound[0]; j <= yBound[1]; j += 1) {
                if (cord[i][j] == 1) cnt += 1;
            }
        }

        System.out.println(cnt);
    }
}