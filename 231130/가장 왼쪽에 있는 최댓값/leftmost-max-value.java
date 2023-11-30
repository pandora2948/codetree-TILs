import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        final int INT_MIN = Integer.MIN_VALUE;
        int n = sc.nextInt(), maxVal;
        int[] arr = new int[n];

        for (int i = 0; i < n; i += 1) {
            arr[i] = sc.nextInt();
        }

        while (n != 0) {
            maxVal = INT_MIN;

            for (int i = 0; i < n; i += 1) {
                if (arr[i] > maxVal) {
                    maxVal = arr[i];
                }
            }
            
            for (int i = 0; i < n; i += 1) {
                if (arr[i] == maxVal) {
                    System.out.printf("%d ", i + 1);
                    n = i;
                    break;
                }
            }
        }

    }
}