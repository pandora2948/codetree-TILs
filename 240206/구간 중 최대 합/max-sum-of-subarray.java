import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int res = 0;

        for (int i = 0; i < n; i += 1) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i <= n - k; i += 1) {
            int sum = 0;
            for (int j = 0; j < k; j += 1) {
                sum += arr[i + j];
            }
            res = Math.max(res, sum);
        }
        System.out.println(res);
    }
}