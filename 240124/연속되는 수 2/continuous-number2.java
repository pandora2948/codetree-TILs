import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        int[] arr = new int[n];

        for (int i = 0 ; i < n; i += 1) {
            int e = sc.nextInt();
            arr[i] = e;
        }

        for (int i = 1; i < n; i += 1) {
            cnt += arr[i - 1] != arr[i] ? 1 : 0;
        }

        System.out.println(cnt);
    }
}