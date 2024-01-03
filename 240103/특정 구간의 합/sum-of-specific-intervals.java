import java.util.Scanner;

public class Main {
    static int[] arr;

    public static void sumByIndex(int a1, int a2) {
        int sum = 0;
        for (int i = a1; i <= a2; i += 1) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i += 1) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i += 1) {
            int a1 = sc.nextInt() - 1;
            int a2 = sc.nextInt() - 1;

            sumByIndex(a1, a2);
        }

    }
}