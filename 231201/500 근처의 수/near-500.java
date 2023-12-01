import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;
        int[] arr = new int[10];
        int maxValue = INT_MIN, minValue = INT_MAX;

        for (int i = 0; i < 10; i += 1) {
            arr[i] = sc.nextInt();

            if (maxValue < arr[i] && arr[i] < 500) {
                maxValue = arr[i];
            }

            if (minValue > arr[i] && arr[i] > 500) {
                minValue = arr[i];
            }
        }

        System.out.printf("%d %d", maxValue, minValue);
    }
}