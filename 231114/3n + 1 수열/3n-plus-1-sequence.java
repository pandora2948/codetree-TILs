import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0;

        while (true) {
            if (n == 1) break;

            if (n % 2 == 0) n /= 2;
            else if (n % 2 == 1) n = n * 3 + 1;
            cnt += 1;
        }
        System.out.print(cnt);
    }
}