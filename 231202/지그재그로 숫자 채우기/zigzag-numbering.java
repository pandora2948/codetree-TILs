import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), cnt= 0;
        int[][] arr = new int[n][m];

        for (int i = 0; i < m; i += 1) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j += 1) {
                    arr[j][i] = cnt;
                    cnt += 1;
                }
            }
            else {
                for (int j = n - 1; j >= 0; j -= 1) {
                    arr[j][i] = cnt;
                    cnt += 1;
                }
            }
        }

        for (int i = 0; i < n; i += 1){
            for (int j = 0; j < m; j += 1) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

    }
}