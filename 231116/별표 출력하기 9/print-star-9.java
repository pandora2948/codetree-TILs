import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i += 1) {
            for (int j = 0; j < (n - i) * 2; j += 1) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) - 1; k += 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}