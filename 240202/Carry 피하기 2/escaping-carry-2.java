import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;

        for (int i = 0; i < n; i += 1) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = i + 1; j < n; j += 1) {
                for (int k = j + 1; k < n; k += 1) {
                    boolean isMagicalNumbers = true;
                    int a = arr[i];
                    int b = arr[j];
                    int c = arr[k];
                    for (int l = 0; l < 4; l += 1) {
                        if ((a % 10) + (b % 10) + (c % 10) > 10) {
                            isMagicalNumbers = false;
                            break;
                        }
                        a /= 10;
                        b /= 10;
                        c /= 10;
                    }
                    max = isMagicalNumbers ? Math.max(max, arr[i] + arr[j] + arr[k]) : max;
                }
            }
        }
        System.out.println(max);
    }
}