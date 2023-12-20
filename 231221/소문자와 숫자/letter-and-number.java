import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (int i = 0; i < str.length(); i += 1) {
            char c = str.charAt(i);
            if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9')) {
                continue;
            }
            else if (c >= 'A' && c <= 'Z') {
                c += 32;
            }
            System.out.print(c);
        }
    }
}