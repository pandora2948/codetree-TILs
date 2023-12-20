import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum = 0;

        for (int i = 0; i < str.length(); i += 1) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                sum += (int) (c - '0');
            }
        }
        System.out.println(sum);
    }
}