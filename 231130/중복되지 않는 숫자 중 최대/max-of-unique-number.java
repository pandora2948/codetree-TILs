import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        final int INT_MIN = Integer.MIN_VALUE;
        int n = sc.nextInt(), maxVal = INT_MIN, cnt = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i += 1) {
            int elem = sc.nextInt();
            arr[i] = elem;

            if (elem > maxVal) {
                maxVal = elem;
                cnt = 1;
            }
            else if (elem == maxVal) {
                cnt += 1;
            }
        }
        System.out.println(cnt >= 2 ? -1 : maxVal);
    }
}