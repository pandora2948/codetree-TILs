import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String strA = sc.next();
        String strB = sc.next();
        StringBuilder sbA = new StringBuilder();
        StringBuilder sbB = new StringBuilder();
        
        for (int i = 0; i < strA.length(); i += 1){
            char c = strA.charAt(i);
            if (c >= '0' && c <= '9') {
                sbA.append(c);
            }
        }

        for (int i = 0; i < strB.length(); i += 1) {
            char c = strB.charAt(i);
            if (c >= '0' && c <= '9') {
                sbB.append(c);
            }
        }

        System.out.println(Integer.parseInt(sbA.toString()) + Integer.parseInt(sbB.toString()));

    }
}