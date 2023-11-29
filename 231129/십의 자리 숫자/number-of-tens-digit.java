import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        for (int i = 0; i < 100; i += 1) {
            int n = sc.nextInt();
            if (n == 0) break;
            if (n >= 10) {
                arr[n / 10 - 1] += 1;
            }
        }

        for (int i = 0; i < 9; i += 1) {
            System.out.printf("%d - %d\n", i + 1, arr[i]);
        }
    }
}