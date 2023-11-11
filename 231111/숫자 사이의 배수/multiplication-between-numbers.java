import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a, b, count = 0, res = 0;
        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = a; i <= b; i += 1) {
            if (i % 5 == 0 || i % 7 == 0) {
                res += i;
                count += 1;
            }
        }
        System.out.printf("%d %.1f", res, (double)res / count);
    }
}