import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[6];

        for (int i = 0; i < 10; i += 1) {
            int n = sc.nextInt();
            cnt[n - 1] += 1;
        }

        for (int i = 0; i < 6; i += 1) {
            System.out.printf("%d - %d\n", i + 1, cnt[i]);
        }
    }
}