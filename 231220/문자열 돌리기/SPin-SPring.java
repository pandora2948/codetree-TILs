import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int l = str.length();


        System.out.println(str);
        for (int i = 0; i < l; i += 1) {
            str = str.substring(l - 1).concat(str.substring(0, l - 1));
            System.out.println(str);
        }

    }
}