import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] pos = new int[101];
        int max = 0;

        for (int i = 0; i < n; i += 1) {
            int a = sc.nextInt();
            int p = sc.nextInt();
            
            pos[p] += a;
        }

        for (int i = 0; i < 101; i += 1) {
            int sum = 0;
            for (int j = 0; j <= k * 2; j += 1) {
                if (i + j > 100) break;

                sum += pos[i + j];
            }

            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}