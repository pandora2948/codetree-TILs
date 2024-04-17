import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int MAX_N = 100;

        int res = Integer.MAX_VALUE;

        int[] x = new int[MAX_N];
        int[] y = new int[MAX_N];

        for (int i = 0; i < n; i += 1) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i += 1) {
            int minX = Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;
            int maxY = Integer.MIN_VALUE;

            for (int j = 0; j < n; j += 1) {
                if (i == j) continue;
                minX = Math.min(minX, x[j]);
                maxX = Math.max(maxX, x[j]);
                minY = Math.min(minY, y[j]);
                maxY = Math.max(maxY, y[j]);
            }
            
            int w = maxX - minX;
            int h = maxY - minY;
            
            res = Math.min(res, h * w);
        }

        System.out.println(res);
    }
}