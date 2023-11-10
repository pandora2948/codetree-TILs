import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int res = 0;
        
        for (int i = 0; i < 10; i += 1) {
            if (sc.nextInt() % 2 == 1) {
                res += 1;
            };
        }
        System.out.println(res);
    }
}