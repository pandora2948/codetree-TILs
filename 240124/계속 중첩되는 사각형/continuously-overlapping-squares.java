import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int[][] cord = new int[201][201];
        int[][] bound = new int[2][2];
        
        for (int i = 0; i < n; i += 1) {
            int[] arg = new int[4];
            for (int j = 0; j < 4; j += 1) {
                arg[j] = sc.nextInt() + 100;
            }

            bound[0][0] = Math.min(bound[0][0], arg[0]);
            bound[0][1] = Math.max(bound[0][1], arg[2]);
            bound[1][0] = Math.min(bound[1][0], arg[1]);
            bound[1][1] = Math.max(bound[1][1], arg[3]);

            for (int j = arg[0]; j < arg[2]; j += 1) {
                for (int k = arg[1]; k < arg[3]; k += 1) {
                    cord[j][k] = i % 2 == 0 ? 0 : 1;
                }
            }
        }

        for (int i = bound[0][0]; i <= bound[0][1]; i += 1) {
            for (int j = bound[1][0]; j <= bound[1][1]; j += 1) {
                if (cord[i][j] == 1) cnt += 1;
            }
        }

        System.out.println(cnt);
    }
}