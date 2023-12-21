import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String tar = sc.next();
        int len = str.length();
        int cnt = 0;

        for (int i = 0; i < str.length(); i += 1) {
            str = str.substring(len - 1).concat(str.substring(0, len - 1));
            cnt += 1;

            if (str.equals(tar)) {
                System.out.println(cnt);
                break;
            }
        }
        if (cnt == str.length()) {
            System.out.println("-1");
        }
    }
}