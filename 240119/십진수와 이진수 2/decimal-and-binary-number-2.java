import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int acc = 1;
        int res = 0;
        
        while (n != 0) {
            res += acc * (n % 10);
            acc *= 2;
            n /= 10;
        }
        
        res *= 17;
        
        while (res != 0) {
            sb.append(res % 2);
            res /= 2;
        }

        System.out.println(sb.reverse().toString());
        
    }
}