import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i += 1) {
            if (i % 2 == 0) {
                for (int j = 0; j < i; j+= 1) {
                    System.out.print("* ");
                }
            }
            else {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}