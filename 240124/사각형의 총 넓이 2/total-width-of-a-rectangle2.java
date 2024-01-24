import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int[][] cord = new int[201][201];
        int[] pos = {100, 100};
        int[] xBound = {200, 0};
        int[] yBound = {200, 0};
        
        for (int i = 0; i < n; i += 1) {
            int[] arg = new int[4];
            for (int j = 0; j < 4; j += 1) {
                arg[j] = sc.nextInt();
            }
            
            for (int j = arg[0]; j < arg[2]; j += 1) {
                for (int k = arg[1]; k < arg[3]; k += 1) {
                    cord[pos[0] + j][pos[1] + k] = 1;
                    xBound[0] = Math.min(xBound[0], pos[1] + k);
                    xBound[1] = Math.max(xBound[1], pos[1] + k);
                }
                yBound[0] = Math.min(yBound[0], pos[0] + j);
                yBound[1] = Math.max(yBound[1], pos[0] + j);
            }
        }

        for (int i = yBound[0]; i <= yBound[1]; i += 1) {
            for (int j = xBound[0]; j <= xBound[1]; j += 1) {
                if (cord[i][j] == 1) cnt += 1;
            }
        }

        System.out.println(cnt);

    }
}