import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] strs = new String[10];

        for (int i = 0; i < 10; i += 1) {
            strs[i] = sc.next();
            System.out.println(strs[i]);
        }
    }
}