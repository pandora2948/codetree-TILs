import java.util.Scanner;

public class Main {
    public static int getGCD(int n, int m) {
        if (m == 0) return n;

        return getGCD(m, n % m);

    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        System.out.println(getGCD(n, m));
        
    }
}