import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        int cnt = 0, acc = 0;

        for (int i = 0; i < 10; i += 1) {
            int n = sc.nextInt();
            if (n == 0) break;
            if (n % 2 == 0) {
                nums[i] = n;
                cnt += 1;
                acc += n;
            }
        }
        System.out.printf("%d %d", cnt, acc);
    }
}