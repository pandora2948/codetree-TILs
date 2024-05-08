import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int res = 0;

        for (int i = x; i <= y; i += 1) {
            int cur = i;
            int sum = 0;

            while (cur > 0) {
                sum += cur % 10;
                cur /= 10;
            }
            res = Math.max(res, sum);
        } 

        System.out.println(res);

    }
}