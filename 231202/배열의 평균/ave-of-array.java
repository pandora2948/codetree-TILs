import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];

        for (int i = 0; i < 2; i += 1) {
            for (int j = 0; j < 4; j += 1) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i += 1) {
            int avg = 0;
            for (int j = 0; j < 4; j += 1) {
                avg += arr[i][j];
            }
            System.out.printf("%.1f ", (double) avg / 4);
        }
        System.out.println();

        for (int i = 0; i < 4; i += 1) {
            int avg = 0;
            for (int j = 0; j < 2; j += 1) {
                avg += arr[j][i];
            }
            System.out.printf("%.1f ", (double) avg / 2);
        }
        System.out.println();

        int avg = 0;
        for (int i = 0; i < 2; i += 1) {
            for (int j = 0; j < 4; j += 1) {
                avg += arr[i][j];
            }
        }
        System.out.printf("%.1f", (double) avg / 8);

    }
}