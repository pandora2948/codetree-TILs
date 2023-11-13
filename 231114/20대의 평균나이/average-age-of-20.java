import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int sumAge = 0, cnt = 0;

        while (true) {
            int n = sc.nextInt();
            if (n < 20 || n > 29) break;
            sumAge += n;
            cnt += 1;
        }
        System.out.printf("%.2f", (double) sumAge / cnt);
    }
}