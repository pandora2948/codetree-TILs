import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int[][] arg = new int[2][3];
        int n = sc.nextInt();
        
        for (int i = 0; i < 2; i += 1) {
            for (int j = 0; j < 3; j += 1) {
                arg[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <= n; j += 1) {
                for (int k = 1; k <= n; k += 1) {
                    if (!((Math.abs(arg[0][0] - i) <= 2 || Math.abs(arg[0][0] - i) >= n - 2) 
                    && (Math.abs(arg[0][1] - j) <= 2 || Math.abs(arg[0][1] - j) >= n - 2) 
                    && (Math.abs(arg[0][2] - k) <= 2 || Math.abs(arg[0][2] - k) >= n - 2)) 
                    && !((Math.abs(arg[1][0] - i) <= 2 || Math.abs(arg[1][0] - i) >= n - 2) 
                    && (Math.abs(arg[1][1] - j) <= 2 || Math.abs(arg[1][1] - j) >= n - 2) 
                    && (Math.abs(arg[1][2] - k) <= 2 || Math.abs(arg[1][2] - k) >= n - 2))) continue;

                    cnt += 1;
                }
            }
        }
 
        System.out.println(cnt);
    }
}