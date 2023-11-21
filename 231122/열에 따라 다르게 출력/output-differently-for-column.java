import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0;

        for (int i = 0; i < n; i += 1) {
            if (i % 2 == 0) {
                for (int j = 1; j <= n; j += 1) {
                    cnt += 1;
                    System.out.printf("%d ", cnt);
                }
            }
            else {
                for (int j = 1; j <= n; j += 1) {
                    cnt += 2;
                    System.out.printf("%d ", cnt);
                }
            }
            System.out.println();
        }
    }
}