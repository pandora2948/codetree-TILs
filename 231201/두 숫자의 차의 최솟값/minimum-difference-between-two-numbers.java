import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        final int INT_MAX = Integer.MAX_VALUE;
        int n = sc.nextInt(), res = INT_MAX;
        int[] arr = new int[n];

        for (int i = 0; i < n; i += 1) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = i + 1; j < n; j += 1) {
                int gap = arr[j] - arr[i];
                res = gap < res ? gap : res;
            }
        }
        System.out.print(res);
    }
}