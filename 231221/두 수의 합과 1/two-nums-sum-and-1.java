import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        String res = Integer.toString(a + b);

        for (int i = 0; i < res.length(); i += 1) {
            cnt = res.charAt(i) == '1' ? cnt + 1 : cnt;
        }

        System.out.println(cnt);
    }
}