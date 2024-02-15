import java.util.*;

public class Main {
    public static int n = 6;
    public static int[] arr = new int[n];
    public static int getDiff(int a, int b) {
        int s1 = arr[a] + arr[b];
        int s2 = 0;
        for (int i = 0; i < n; i += 1) {
            s2 += arr[i];
        }
        s2 -= s1;
        
        return Math.abs(s1 - s2);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int res = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i += 1) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = i + 1; j < n; j += 1) {
                res = Math.min(res, getDiff(i, j));
            }
        }
        System.out.println(res);
    }
}