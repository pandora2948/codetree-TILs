import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] tbl = new int[n][n];
        int max = 0;

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                tbl[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n - 2; j += 1) {
                max = Math.max(max, (tbl[i][j] + tbl[i][j + 1] + tbl[i][j + 2]));
            }
        }
        System.out.println(max);
    }
}