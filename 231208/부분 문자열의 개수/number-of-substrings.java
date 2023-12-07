import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int cnt = 0;

        for (int i = 0; i < a.length() - 1; i += 1) {
            if (String.valueOf(a.charAt(i)).concat(String.valueOf(a.charAt(i + 1))).equals(b)) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}