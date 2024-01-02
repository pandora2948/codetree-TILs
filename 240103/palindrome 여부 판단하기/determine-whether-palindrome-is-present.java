import java.util.Scanner;

public class Main {
    public static String shuffle(String str) {
        StringBuilder stb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i -= 1) {
            stb.append(str.charAt(i));
        }
        return stb.toString();
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        System.out.println(str.equals(shuffle(str)) ? "Yes" : "No");
    }
}