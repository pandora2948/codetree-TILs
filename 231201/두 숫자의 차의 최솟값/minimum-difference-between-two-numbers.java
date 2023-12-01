import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        final int INT_MAX = Integer.MAX_VALUE;
        int n = sc.nextInt(), res = INT_MAX;
        int[] arr = new int[n];

        for (int i = 0; i < n; i += 1) {
            arr[i] = sc.nextInt();
            for (int j = 0; j < n; j += 1) {
                if (arr[i] == arr[j]) continue;
                
                int gap = Math.abs(arr[i] - arr[j]);
                res = gap < res ? gap : res;
            }
        }
        System.out.print(res);
    }
}