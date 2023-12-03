import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), cnt = 1;
        int[][] arr = new int[n][n];

        for (int i = 0; i < m; i += 1) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            arr[r - 1][c - 1] = cnt;
            cnt += 1;
        }

        for (int i = 0; i < n; i += 1) {
            for(int j = 0; j < n; j += 1) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}