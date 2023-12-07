import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String ab = str1.concat(str2);
        String ba = str2.concat(str1);
        boolean isSame = true;

        for (int i = 0; i < ab.length(); i += 1) {
            if (ab.charAt(i) != ba.charAt(i)) {
                isSame = false;
                break;
            }
        }

        System.out.println(isSame ? "true" : "false");

    }
}