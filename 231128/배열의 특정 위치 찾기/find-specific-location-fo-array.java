import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int evenSum = 0, thirdSum = 0;

        for (int i = 0; i < 10; i += 1) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < 10; i += 2) {
            evenSum += arr[i];
        }

        for (int i = 2; i < 10; i += 3) {
            thirdSum += arr[i];
        }
        System.out.printf("%d %.1f", evenSum, (double) thirdSum / 3);
    }
}