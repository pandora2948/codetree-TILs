import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        for (int i = 1; i <= 9; i += 1) {
            for (int j = b; j >= a; j -= 2) {
                System.out.printf("%d * %d = %d", j, i, i * j);
                if (j != a) {
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}