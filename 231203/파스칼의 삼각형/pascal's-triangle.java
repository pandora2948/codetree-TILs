import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j <= i; j += 1) {
                arr[i][j] = 1;
            }
        }

        for (int i = 2; i < n; i += 1) {
            for (int j = 0; j <= i; j += 1) {
                try {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                catch (Exception e) {
                    continue;
                }
            }
        }


        // for (int i = 0; i < n; i += 1) {
        //     for (int j = 0; j <= i; j += 1) {
        //         arr[i][]
        //     }
        // }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j <= i; j += 1) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}