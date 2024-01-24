import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] cord = new int[2001][2001];
        int pos = 1000;
        int cnt = 0;
        int[] xBound = {2000, 0};
        int[] yBound = {2000, 0};
        
        for (int i = 0; i < 3; i += 1) {
            int[] arg = new int[4];
            for (int j = 0; j < 4; j += 1) {
                arg[j] = sc.nextInt();
            }

            xBound[0] = Math.min(xBound[0], arg[0] + pos);
            xBound[1] = Math.max(xBound[1], arg[2] + pos);
            yBound[0] = Math.min(yBound[0], arg[1] + pos);
            yBound[1] = Math.max(yBound[1], arg[3] + pos);

            for (int j = arg[0]; j < arg[2]; j += 1) {
                for (int k = arg[1]; k < arg[3]; k += 1) {
                    cord[j + pos][k + pos] = i == 2 ? 0 : 1;
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