import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i += 1) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i += 1 ) {
            for (int j = i + 1; j < n; j += 1) {
                for (int k = j + 1; k < n; k += 1) {
                    if (arr[i] <= arr[j] && arr[j] <= arr[k]) {
                        cnt += 1;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}