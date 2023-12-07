import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next().concat("-");
        String result = "";

        char before = a.charAt(0);
        int cnt = 1;

        for (int i = 1; i < a.length(); i += 1) {
            if (a.charAt(i) != before) {
                result = result.concat(String.valueOf(before)).concat(String.valueOf(cnt));
                before = a.charAt(i);
                cnt = 1;
            } else if (a.charAt(i) == before) {
                cnt += 1;
            }
        }

        System.out.println(result.length());
        System.out.println(result);
    }
}