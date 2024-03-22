import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(), d1 = sc.nextInt();
        int m2 = sc.nextInt(), d2 = sc.nextInt();
        String tar = sc.next();
        int cnt = 0;
        int dc = 0;

        int[] d = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] a = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        while (m1 != m2 || d1 != d2) {
            dc = (dc + 1) % 7;
            d1 += 1;

            if (d[m1] < d1) {
                d1 = 1;
                m1 += 1;
            }

            if (a[dc].equals(tar)) {
                cnt += 1;
            }
        }

        System.out.println(cnt);


    }
}