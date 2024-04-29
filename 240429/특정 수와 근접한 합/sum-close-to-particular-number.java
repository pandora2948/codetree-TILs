import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int res = 100;
        int[] arr = new int[n];

        for (int i = 0; i < n; i += 1) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                if (i == j) continue;
                int sum = 0;

                for (int k = 0; k < n ; k += 1) {
                    if (k == i || k == j) continue;
                    sum += arr[k];
                }
                
                if (Math.abs(res - s) > Math.abs(sum - s)) {
                    res = sum;
                }

            }
        }
        System.out.println(Math.abs(res - s));
    }
}