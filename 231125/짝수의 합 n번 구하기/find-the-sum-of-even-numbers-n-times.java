import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i += 1) {
            int a = sc.nextInt(), b = sc.nextInt(), sum = 0;
            for (int j = a; j <= b; j += 1) {
                sum = j % 2 == 0 ? sum + j : sum;
            }
            System.out.println(sum);
        }
    }
}