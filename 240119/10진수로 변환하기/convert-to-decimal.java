import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int acc = 1;
        int res = 0;

        while (n != 0) {
            res += acc * (n % 10);
            acc *= 2;
            n /= 10;
        }

        System.out.print(res);
        
    }
}