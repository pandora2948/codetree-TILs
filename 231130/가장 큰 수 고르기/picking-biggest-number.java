import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        final int MIN_VAL = Integer.MIN_VALUE;
        int result = MIN_VAL;

        for (int i = 0; i < 10; i += 1) {
            int n = sc.nextInt();
            result = n > result ? n : result;
        }

        System.out.println(result);
    }
}