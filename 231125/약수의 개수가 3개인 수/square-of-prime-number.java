import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(), e = sc.nextInt(), res = 0;

        for (int i = s; i <= e; i += 1) {
            int cnt = 0;
            for (int j = 1; j <= i; j += 1) {
                cnt = i % j == 0 ? cnt + 1 : cnt;
            }
            res = cnt == 3 ? res + 1 : res; 
        }
        System.out.print(res);
    }
}