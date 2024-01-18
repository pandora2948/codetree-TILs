import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();

        while (n != 0) {
            sb.append(n % 2);
            n /= 2;
        }

        System.out.println(sb.reverse().toString());
    }
}