import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 0;
        int[] times = new int[1000];
        int[] idx = {Integer.MAX_VALUE, 0};

        for (int i = 0; i < n; i += 1) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            int b = sc.nextInt();

            idx[0] = Math.min(idx[0], s);
            idx[1] = Math.max(idx[1], t);

            for (int j = s; j <= t; j += 1) {
                times[j] += b;
            }
        }

        for (int i = idx[0]; i <= idx[1]; i += 1) {
            min = Math.max(min, times[i]);
        }

        System.out.println(min);

    }
}