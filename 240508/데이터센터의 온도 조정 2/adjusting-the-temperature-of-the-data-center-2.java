import java.util.Scanner;

public class Main {
    public static int c, g, h;
    public static int getPowerCount(int a, int b, int c) {
        if (c < a) return this.c;

        if (a <= c && c <= b) return g;

        if (b < c) return h;
        return 0;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        c = sc.nextInt();
        g = sc.nextInt();
        h = sc.nextInt();

        int[] ta = new int[n];
        int[] tb = new int[n];

        for (int i = 0; i < n; i += 1) {
            ta[i] = sc.nextInt();
            tb[i] = sc.nextInt();
        }

        for (int i = 0; i <= 1000; i += 1) {
            int sum = 0;
            
            for (int j = 0; j < n; j += 1) {
                sum += getPowerCount(ta[j], tb[j], i);
            }
            res = Math.max(res, sum);
        }

        System.out.println(res);
    }
}