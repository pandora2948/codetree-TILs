import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <= n; j += 1) {
                System.out.printf("(%d,%d) ", (int) Math.pow(i, 2), (int) Math.pow(j, 2));
            }
            System.out.println();
        }
    }
}