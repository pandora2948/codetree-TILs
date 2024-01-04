import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] tbl = new int[4][4];

        for (int i = 0; i < 4; i += 1) {
            int sum = 0;
            for (int j = 0; j < 4; j += 1) {
                tbl[i][j] = sc.nextInt();
                sum += tbl[i][j];
            }
            System.out.println(sum);
        }
    }
}