import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int cnt = 1;
        int max = 1;
        int[] arr = new int[n];
        boolean isExist = false;

        for (int i = 0; i < n; i += 1){
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i += 1) {
            if (arr[i - 1] <= arr[i] && arr[i] > t) {
                cnt += 1;
                max = Math.max(max, cnt);
                isExist = true;
            }
            cnt = 1;
        }

        System.out.println(isExist ? max : 0);
    }
}