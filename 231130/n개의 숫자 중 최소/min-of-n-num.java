import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        final int INT_MAX = Integer.MAX_VALUE;
        int n = sc.nextInt(), minVal = INT_MAX, cnt = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i += 1) {
            arr[i] = sc.nextInt();
            minVal = arr[i] < minVal ? arr[i] : minVal;
        }

        for (int i = 0; i < n; i += 1) {
            cnt = arr[i] == minVal ? cnt + 1 : cnt;
        }

        System.out.printf("%d %d", minVal, cnt);
    }
}