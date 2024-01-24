import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int cnt;
        int max = 1;
        int[] arr = new int[n];

        for (int i = 0; i < n; i += 1){
            arr[i] = sc.nextInt();
        }

        cnt = arr[0] > t ? 1 : 0;

        for (int i = 1; i < n; i += 1) {
            if (arr[i] > t) {
                if (arr[i - 1] <= arr[i]) {
                    cnt += 1;
                    max = Math.max(cnt, max);
                    continue;
                }

                cnt = 1;
                continue;
            }
            cnt = 0;
        }

        System.out.println(max == 1 ? 0 : max);
    }
}