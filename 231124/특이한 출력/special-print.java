import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <= n; j += 1) {
                if ((i + j) % 4 == 0) {
                    System.out.println("(" + i + ", " + j + ")");
                }
                else {
                    System.out.printf("(%d, %d) ", i, j);
                }
            }
        }
    }
}