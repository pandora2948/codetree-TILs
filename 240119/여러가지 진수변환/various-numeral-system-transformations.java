import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            sb.append(n % b);
            n /= b;
        }

        System.out.println(sb.reverse().toString());
    
    }
}