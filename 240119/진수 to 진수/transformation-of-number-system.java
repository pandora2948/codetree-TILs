import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int acc = 1;
        int res = 0;
        int a = sc.nextInt(), b = sc.nextInt();
        int n = sc.nextInt();
        
        while (n != 0) {
            res += acc * (n % 10);
            acc *= a;
            n /= 10;
        }

        while (res != 0) {
            sb.append(res % b);
            res /= b;
        }

        System.out.println(sb.reverse().toString());
    }
}