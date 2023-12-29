import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();

        for (int i = 0; i < q; i += 1) {
            int pos = sc.nextInt() - 1;
            if (pos >= str.length()) continue;
            str = str.substring(0, pos).concat(str.substring(pos + 1));
            System.out.println(str);
        }

    }
}