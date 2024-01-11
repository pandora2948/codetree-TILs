import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int d = 11, h = 11, m = 11;
        int res = 0;

        if ((a * 24 * 60 + b * 60 + c) - (11 * 24 * 60 + 11 * 60 + 11) < 0) {
            System.out.println("-1");
            return;
        }

        while (d != a || h != b || m != c) {
            m += 1;
            res += 1;

            if (m == 60) {
                h += 1;
                m = 0;
            }

            if  (h == 24) {
                d += 1;
                h = 0;
            }
        }

        System.out.println(res);
    }
}