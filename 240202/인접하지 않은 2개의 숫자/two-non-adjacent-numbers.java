import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i += 1) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                if (i - 1 == j || i == j || i + 1 == j) continue;

                max = Math.max(max, arr[i] + arr[j]);
            }
        }

        System.out.println(max);
    }
}