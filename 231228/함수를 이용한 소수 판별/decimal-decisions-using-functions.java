import java.util.Scanner;

public class Main {
    public static int checkPrime(int n) {
        for (int i = n - 1; i > 1; i -= 1) {
            if (n % i == 0) {
                
                return 0;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        if (a - b != 0) {
            for (int i = a; i <= b; i += 1) {
                sum += checkPrime(i);
            }
            System.out.println(sum);
        }
        else {
            System.out.println(0);
        }

        
        
    }
}