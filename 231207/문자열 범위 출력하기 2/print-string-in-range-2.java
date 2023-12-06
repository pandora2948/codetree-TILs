import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int len = str.length();

        if (n > len) {
            for (int i = len - 1; i >= 0; i -= 1) {
                System.out.print(str.charAt(i));
            }
        }
        else {
            for (int i = len - 1; i >= len - n; i -= 1) {
                System.out.print(str.charAt(i));
            }
        }
    }
}