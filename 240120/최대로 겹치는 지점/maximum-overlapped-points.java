import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] res = new int[101];
        int border = 0;
        int max = 0;

        for (int i = 0; i < n; i += 1) {
            int st = sc.nextInt();
            int ed = sc.nextInt();
            border = Math.max(border, ed);

            for (int j = st; j <= ed; j += 1) {
                res[j] += 1;
            }
        }
        
        for (int i = 0; i <= border; i += 1) {
            max = Math.max(max, res[i]);
        }

        System.out.println(max);
    }
}