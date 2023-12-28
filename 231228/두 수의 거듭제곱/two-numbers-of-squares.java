import java.util.Scanner;

public class Main {
    public static void printSquare(int n, int m) {
        int res = 1;

        for (int i = 0; i < m; i += 1) {
            res *= n;
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        printSquare(a, b);

    }
}