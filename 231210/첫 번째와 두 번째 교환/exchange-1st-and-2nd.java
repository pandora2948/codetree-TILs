import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] strArr = str.toCharArray();
        char target1 = strArr[0];
        char target2 = strArr[1];

        for (int i = 0; i < strArr.length; i += 1) {
            if (strArr[i] == target1) {
                strArr[i] = target2;
            }
            else if (strArr[i] == target2) {
                strArr[i] = target1;
            }
        }

        System.out.println(String.valueOf(strArr));

    }
}