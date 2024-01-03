import java.util.Scanner;

public class Main {
    public static int recursivePower(int n) {
        if (n < 10) return (int) Math.pow(n, 2);

        return recursivePower(n / 10) + (int) Math.pow(n % 10, 2);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(recursivePower(n));

    }
}