import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), res = 0, i = 0;

        for (i = 1; i <= 100; i += 1) {
            res += i;
            if (res >= n) {
                break;
            }
        }
        System.out.print(i);
    }
}