import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isComb = false;

        for (int i = 2; i < n; i += 1) {
            if (n % i == 0) {
                isComb = true;
                break;
            }
        }
        System.out.print(isComb ? "C" : "N");
    }
}