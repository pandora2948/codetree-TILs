import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a, b, res = 1;
        a = sc.nextInt();
        b = sc.nextInt();
        for (int i = a; i <= b; i += 1) {
            res *= i;
        }
        System.out.print(res);
    }
}