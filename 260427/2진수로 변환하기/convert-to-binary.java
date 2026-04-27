import java.util.Scanner;
public class Main {
    static StringBuilder sb = new StringBuilder();
    static void f(int n) {
        if (n == 1) {
            sb.append(n);
            return;
        }
        f(n / 2);

        sb.append(n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        f(n);
        System.out.println(sb.toString());
    }
}