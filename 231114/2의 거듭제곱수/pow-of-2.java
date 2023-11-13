import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = 0;
        
        while (true) {
            n /= 2;
            x += 1;
            if (n == 1) break;
        }
        System.out.print(x);
    }
}