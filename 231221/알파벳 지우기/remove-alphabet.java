import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String strA = sc.next();
        String strB = sc.next();

        for (int i = 0; i < strA.length(); i += 1) {
            char c = strA.charAt(i);
            if (c < '0' || c > '9') {
                for (int j = i; j < strA.length(); j += 1) {
                    char c2 = strA.charAt(j);
                    if (c2 >= '0' && c2 <= '9') {
                        strA = strA.substring(0, i).concat(strA.substring(j));
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < strB.length(); i += 1) {
            char c = strB.charAt(i);
            if (c < '0' || c > '9') {
                for (int j = i; j < strB.length(); j += 1) {
                    char c2 = strB.charAt(j);
                    if (c2 >= '0' && c2 <= '9') {
                        strB = strB.substring(0, i).concat(strB.substring(j));
                        break;
                    }
                }
            }
        }

        System.out.println(Integer.parseInt(strA) + Integer.parseInt(strB));

    }
}