import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i += 1) {
            int sum = 0;
            for (int j = 1; j <= i; j += 1) {
                sum = i % j == 0 ? sum + j : sum;
            }
            System.out.printf(sum == i + 1 ? "%d " : "", i);
        }
    }
}