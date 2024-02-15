import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int res = 0;

        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <= n; j += 1) {
                for (int k = 1; k <= n; k += 1) {
                    if (Math.abs(a - i) <= 2 || Math.abs(b - j) <= 2 || Math.abs(c - k) <= 2) {
                        res += 1;
                    }
                }
            }
        }
        System.out.println(res);
    }
}