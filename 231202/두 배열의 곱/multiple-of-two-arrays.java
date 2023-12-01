import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][3];

        for (int i = 0; i < 6; i += 1) {
            for (int j = 0; j < 3; j += 1) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i += 1) {
            for (int j = 0; j < 3; j += 1) {
                System.out.printf("%d ", arr[i][j] * arr[i + 3][j]);
            }
            System.out.println();
        }
    }
}