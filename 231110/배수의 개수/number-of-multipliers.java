import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int res1 = 0, res2 = 0;
        
        for (int i = 0; i < 10; i += 1) {
            int n = sc.nextInt();
            if (n % 3 == 0) {
                res1 += 1;
            }
            if (n % 5 == 0) {
                res2 += 1;
            }
        }
        System.out.printf("%d %d", res1, res2);
    }
}