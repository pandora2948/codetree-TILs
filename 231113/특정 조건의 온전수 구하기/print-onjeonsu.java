import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i += 1) {
            if (i % 2 == 0 || (i % 10 != 0 && i % 10 % 5 == 0) || (i % 3 == 0 && i % 9 != 0)) continue;
            else System.out.printf("%d ", i);
        }
    }
}