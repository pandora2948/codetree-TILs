import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] std = new int[n];

        for (int i = 0; i < m; i += 1) {
            int num = sc.nextInt() - 1;
            std[num] += 1;
            if (std[num] >= k) {
                System.out.println(num + 1);
                return;
            }
        }
        System.out.println(-1);
    }
}