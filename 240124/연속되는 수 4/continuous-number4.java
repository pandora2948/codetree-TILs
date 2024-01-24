import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        int max = 1;

        for (int i = 0; i < n; i += 1) {
            int e = sc.nextInt();
            arr[i] = e;
        }

        for (int i = 0; i < n; i += 1) {
            if (i == 0 || arr[i - 1] >= arr[i]) {
                cnt = 1;
                continue;
            }

            cnt += 1;
            max = Math.max(cnt, max);
        }

        System.out.println(max);
    }
}