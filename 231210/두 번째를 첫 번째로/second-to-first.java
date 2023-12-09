import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] strArr = str.toCharArray();
        char a = strArr[0];
        char b = strArr[1];

        for (int i = 0; i < strArr.length; i += 1) {
            if (strArr[i] == b) strArr[i] = a;
        }
        System.out.println(String.valueOf(strArr));
    }
}