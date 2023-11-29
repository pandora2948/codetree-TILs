import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[9];
        int n = sc.nextInt();

        for (int i = 0; i < n; i += 1) {
            int num = sc.nextInt();
            cnt[num - 1] += 1;
        }

        for (int i = 0; i < 9; i += 1) {
            System.out.println(cnt[i]);
        }
    }
}