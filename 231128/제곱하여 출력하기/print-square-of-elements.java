import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i += 1) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i += 1) {
            System.out.printf("%d ", (int) Math.pow(arr[i], 2));
        }
    }
}