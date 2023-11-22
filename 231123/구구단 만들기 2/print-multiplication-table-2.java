import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        for (int i = 1; i < 5; i += 1) {
            for (int j = b; j >= a; j -= 1) {
                System.out.printf("%d * %d = %d", j, i * 2, j * i * 2);
                if (j != a) {
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}