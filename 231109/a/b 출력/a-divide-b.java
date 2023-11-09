import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a, b;
        double result;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.printf("%d.", a / b);
        a *= 10;
        int i = 0;
        while (i < 20) {
            System.out.printf("%d", a / b);
            a = a % b * 10;
            i += 1;
        }
        
    }
}