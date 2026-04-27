import java.util.Scanner;

public class Main {
    public static int getDays(int m, int d) {
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int res = d;

        for (int i = 1; i < m; i += 1) {
            res += days[i];
        }

        return res;
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(),
            b = sc.nextInt(),
            c = sc.nextInt(),
            d = sc.nextInt();

        System.out.println(getDays(c, d) - getDays(a, b) + 1);
    }
}