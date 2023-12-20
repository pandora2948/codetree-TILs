import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String strA = sc.next();
        String strB = sc.next();

        for (int i = 0; i <= strA.length() - strB.length(); i += 1) {
            if (strA.startsWith(strB, i)) {
                strA = strA.substring(0, i).concat(strA.substring(i + strB.length()));
                i = 0;
            }
        }
        System.out.println(strA);
    }
}