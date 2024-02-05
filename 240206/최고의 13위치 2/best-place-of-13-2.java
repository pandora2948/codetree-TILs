import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int[][] tbl = new int[n][n];

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                tbl[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n - 2; j += 1) {
                for (int k = 0; k < n; k += 1) {
                    for (int l = 0; l < n - 2; l += 1) {
                        if (i == k && Math.abs(j - l) <= 2) continue;
                        int sum = 0;
                        for (int m = 0; m < 3; m += 1) {
                            sum += tbl[i][j + m] + tbl[k][l + m];
                        }
                        max = Math.max(max, sum);
                    }
                }
            }
        }
        System.out.println(max);

    }
}