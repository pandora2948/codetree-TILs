import java.util.Scanner;

public class Main {
    public static int recursiveDivider(int n) {
        if (n == 1) return 0;

        return n % 2 == 0 ? recursiveDivider(n / 2) + 1 : recursiveDivider(n / 3) + 1;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int cnt = recursiveDivider(n);
        System.out.println(cnt);
    }
}