import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < m; j += 1) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < m; j += 1) {
                System.out.print(arr[i][j] == sc.nextInt() ? "0 " : "1 ");
            }
            System.out.println();
        }
    }
}