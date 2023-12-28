import java.util.Scanner;

public class Main {
    public static boolean checkLeap(int n) {
        if (n % 4 != 0) return false;

        if (n % 100 != 0) return true;

        if (n % 400 == 0) return true;

        return false;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(checkLeap(n));

    }
}