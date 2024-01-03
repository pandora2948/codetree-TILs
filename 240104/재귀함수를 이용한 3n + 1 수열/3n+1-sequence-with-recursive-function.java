import java.util.Scanner;
                
public class Main {
    public static int f(int n) {
        if (n == 1) return 0;

        return n % 2 == 0 ? f(n / 2) + 1 : f(n * 3 + 1) + 1;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(f(n));
    }
}