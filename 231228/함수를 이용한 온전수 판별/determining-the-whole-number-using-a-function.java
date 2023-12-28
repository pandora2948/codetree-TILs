import java.util.Scanner;

public class Main {
    public static int getNumberOfPN(int a, int b) {
        int cnt = 0;
        for (int i = a; i <= b; i += 1) {
            if (i % 2 == 0) continue;

            if (i % 10 == 5) continue;

            if (i % 3 == 0 && i % 9 != 0) continue;

            cnt += 1;
        }

        return cnt;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(getNumberOfPN(a, b));
    }
}