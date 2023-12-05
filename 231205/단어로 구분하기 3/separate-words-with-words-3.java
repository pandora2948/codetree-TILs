import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] strs = new String[10];

        for (int i = 0; i < 10; i += 1) {
            strs[i] = sc.next();
        }

        for (int i = strs.length - 1; i >= 0; i -= 1) {
            System.out.println(strs[i]);
        }
    }
}