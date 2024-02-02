import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int max = 0;

        for (int i = 0; i < a.length(); i += 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.substring(0, i)).append(1).append(a.substring(i + 1, a.length()));
            max = Math.max(max, Integer.parseInt(sb.toString(), 2));
        }

        System.out.println(max == Integer.parseInt(a, 2) ? 0 : max);
    }
}