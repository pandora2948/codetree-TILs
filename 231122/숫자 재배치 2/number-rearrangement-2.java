import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i += 1) {
            nums[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i -= 1) {
            System.out.printf("%d ", nums[i]);
        }
    }
}