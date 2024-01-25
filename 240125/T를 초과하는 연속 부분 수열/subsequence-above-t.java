import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int max = 1;
        int cnt = 1;
        int[] arr = new int[n];
        int idx = 0;
        for (int i = 0; i < n; i += 1) {
            int num = sc.nextInt();

            if (num > t) {
                arr[idx] = num;
                idx += 1;
            }
        }
        
        for (int i = 1; i <= idx; i += 1) {
            if (arr[i - 1] < arr[i]) {
                cnt += 1;
                max = Math.max(max, cnt);
                continue;
            }
            cnt = 1;
        }

        System.out.println(max == 1 ? 0 : max);
    }
}