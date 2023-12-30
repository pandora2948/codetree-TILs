import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt() - 1;
        int d = sc.nextInt() - 1;
        int[][] cal = new int[21][51];

        for (int i = 0; i < 12; i += 1) {
            if (i == 1) {
                for (int j = 0; j < 28; j += 1) {
                    cal[i][j] = 1;
                }
            } else if (i % 2 == 0) {
                for (int j = 0; j < 31; j += 1) {
                    cal[i][j] = 1;
                }
            }
            else {
                for (int j = 0; j < 30; j += 1) {
                    cal[i][j] = 1;
                }

            }
        }

        System.out.println(cal[m][d] == 1 ? "Yes" : "No");
    }
}