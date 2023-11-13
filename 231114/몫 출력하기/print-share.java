import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n, cnt = 0;
        while (true) {
            if (cnt == 3) break;
            n = sc.nextInt();

            if (n % 2 == 1) continue;
            else if (n % 2 == 0) {
                System.out.println(n / 2);
                cnt += 1;
            }
        }
    }
}