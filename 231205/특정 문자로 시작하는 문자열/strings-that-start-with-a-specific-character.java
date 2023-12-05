import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        int len = 0, cnt = 0;

        for (int i = 0; i < n; i += 1) {
            strs[i] = sc.next();
        }

        char alph = sc.next().charAt(0);

        for (int i = 0; i < n; i += 1) {
            if (strs[i].charAt(0) == alph) {
                len += strs[i].length();
                cnt += 1;
            }
        }
        System.out.printf("%d %.2f", cnt, (double) len / cnt);
    }
}