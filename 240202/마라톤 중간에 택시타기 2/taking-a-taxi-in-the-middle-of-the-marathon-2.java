import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] cp = new int[n][2];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < 2; j += 1) {
                cp[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i < n; i += 1) {
            int[][] cpp = new int[n - 1][2];
            int idx = 0;
            int sum = 0;
            for (int j = 0; j < n; j += 1) {
                if (i == j) continue;
                cpp[idx] = cp[j];
                idx += 1;
            }

            for (int j = 0; j < n - 2; j += 1) {
                sum += Math.abs(cpp[j][0] - cpp[j + 1][0]) + Math.abs(cpp[j][1] - cpp[j + 1][1]);
            }
            
            min = Math.min(min, sum);
        }
        System.out.println(min);
    }
}