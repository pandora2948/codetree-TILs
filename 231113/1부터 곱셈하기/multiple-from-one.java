import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int i, n = sc.nextInt(), res = 1;

        for (i = 1; i <= 10; i += 1) {
            res *= i;
            if (res >= n) break;
        }
        System.out.print(i);
    }
}