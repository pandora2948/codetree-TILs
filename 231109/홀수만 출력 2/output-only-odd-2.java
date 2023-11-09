import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a, b;
        b = sc.nextInt();
        a = sc.nextInt();

        for (int i = b; i >= a; i -= 1) {
            System.out.printf(i % 2 != 0 ? "%d " : "", i);
        }
    }
}