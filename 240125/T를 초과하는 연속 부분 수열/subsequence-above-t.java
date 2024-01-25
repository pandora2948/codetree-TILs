import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int max = 0;
        int cnt = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i += 1) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        for (int i = 0; i < n; i += 1) {
            if (i > 0 && arr[i] > t) {
                cnt += 1;
                max = Math.max(max, cnt);
                continue;
            }
            cnt = 1;
        }

        System.out.println(max);
    }
}