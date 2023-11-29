import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int INT_MIN = Integer.MIN_VALUE;
        int maxVal = INT_MIN, secondMax = INT_MIN;
        int[] arr = new int[n];

        for (int i = 0; i < n; i += 1) {
            arr[i] = sc.nextInt();
            maxVal = maxVal < arr[i] ? arr[i] : maxVal;
        }

        for (int i = 0; i < n; i += 1) {
            if (arr[i] != maxVal && secondMax < arr[i]) {
                secondMax = arr[i];
            }
        }

        System.out.printf("%d %d", maxVal, secondMax);

    }
}