import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        int acc = 0, leng = 0;

        for (int i = 0; i < 10; i += 1) {
            int n = sc.nextInt();
            leng = i;
            if (n == 0) break;
            nums[i] = n;
            acc += n;
        }
        System.out.printf("%d %.1f", acc, (double) acc / leng);
    }
}