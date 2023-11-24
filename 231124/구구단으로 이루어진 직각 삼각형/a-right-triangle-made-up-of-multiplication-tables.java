import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <= n - i + 1; j += 1) {
                System.out.printf(j != n - i + 1 ? "%d * %d = %d / " : "%d * %d = %d\n", i, j, i * j );
            }
        }
    }
}