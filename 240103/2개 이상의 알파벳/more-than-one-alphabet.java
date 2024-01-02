import java.util.Scanner;

public class Main {
    public static boolean check(String str) {
        char tar = str.charAt(0);
        for (int i = 1; i < str.length(); i += 1) {
            if (str.charAt(i) != tar) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String strA = sc.next();

        System.out.println(check(strA) ? "Yes" : "No");
        
    }
}