import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int res = 0;

        for (int i = 0; i < k; i += 1) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j = a - 1; j < b; j += 1) {
                arr[j] += 1;
            }
        }

        for (int i = 0; i < n; i += 1) {
            res = Math.max(res, arr[i]);
        }

        System.out.println(res);
    }
}