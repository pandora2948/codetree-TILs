import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), res = 0, cnt = 0;

        for (int i = 0; i < n; i += 1) {
            res += sc.nextInt();
            cnt += 1;
        }
        System.out.printf("%d %.1f", res, (double) res / cnt);
    }
}