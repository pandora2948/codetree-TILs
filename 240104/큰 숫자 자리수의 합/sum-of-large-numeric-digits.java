import java.util.Scanner;

public class Main {
    static int[] arr;

    public static int f(int n) {
        if (n == 0) return arr[0];

        int p = f(n - 1);

        return p * arr[n];
    }

    public static int g(int n) {
        if (n < 10) return n;

        return g(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        arr = new int[3];

        for (int i = 0; i < 3; i += 1) {
            arr[i] = sc.nextInt();
        }

        System.out.println(g(f(2)));
    }
}