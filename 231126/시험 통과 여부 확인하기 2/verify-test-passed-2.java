import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0, result = 0;

        for (int i = 0; i < n; i += 1) {
            int[] scores = new int[4];
            int acc = 0;
            for (int j = 0; j < 4; j += 1) {
                int score = sc.nextInt();
                scores[i] = score;
                acc += score;
            }
            System.out.println(acc / 4 >= 60 ? "pass" : "fail");
            result = acc / 4 >= 60 ? result + 1 : result;
        }
        System.out.println(result);
    }
}