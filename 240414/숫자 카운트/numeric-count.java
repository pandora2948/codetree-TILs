import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        final int MAX_N = 10;

        int n = sc.nextInt();
        int cnt = 0;

        int[] a = new int[MAX_N];
        int[] b = new int[MAX_N];
        int[] c = new int[MAX_N];

        for (int i = 0; i < n; i += 1) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        for (int i = 1; i <= 9; i += 1) {
            for (int j = 1; j <= 9; j += 1) {
                for (int k = 1; k <= 9; k += 1) {
                    if (i == j || j == k || k == i) continue;

                    boolean success = true;

                    for (int q = 0; q < n; q += 1) {
                        int x = a[q] / 100;
                        int y = a[q] / 10 % 10;
                        int z = a[q] % 10;

                        int cnt1 = 0, cnt2 = 0;

                        if (x == i) cnt1 += 1;

                        if (y == j) cnt1 += 1;

                        if (z == k) cnt1 += 1;

                        if (x == j || x == k) cnt2 += 1;

                        if (y == i || y == k) cnt2 += 1;

                        if (z == i || z == j) cnt2 += 1;

                        if (cnt1 != b[q] || cnt2 != c[q]) {
                            success = false;
                            break;
                        }
                    }

                    if (success) {
                        cnt += 1;
                    }

                }
            }
        }

        System.out.println(cnt);

    }
}