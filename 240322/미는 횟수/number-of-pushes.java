import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        String a = sc.next();
        String b = sc.next();

        for (int i = 0; i < b.length(); i += 1) {
            if (b.equals(a)) {
                break;
            }
            
            a = a.substring(a.length() - 1).concat(a.substring(0, a.length() - 1));
            cnt += 1;
        }

        System.out.println(a.equals(b) ? cnt : -1);
    }
}