import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0;
        int[] nums = new int[n];

        for (int i = 0; i < n; i += 1) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                nums[cnt] = num;
                cnt += 1;
            }
        }
        
        for (int i = cnt - 1; i >= 0; i -= 1) {
            System.out.printf("%d ", nums[i]);
        }
    }
}