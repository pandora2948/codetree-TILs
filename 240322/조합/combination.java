import java.util.Scanner;

public class Main {
    public static int n;
    public static int m;
    public static int[] arr;
    public static int cnt = 0;

    public static void combination(int idx, int level) {
        if (level == m) {
            cnt += 1;
            return;
        }

        for (int i = idx; i < n; i += 1) {
            combination(i + 1, level + 1);
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];

        combination(0, 0);

        System.out.println(cnt);
    }
}