import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = sc.nextInt();
        char[] strArr = s.toCharArray();

        for (int i = 0; i < q; i += 1) {
            if (sc.nextInt() == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                char tmp;

                tmp = strArr[a - 1];
                strArr[a - 1] = strArr[b - 1];
                strArr[b - 1] = tmp;

            }
            else {
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);
                for (int j = 0; j < strArr.length; j += 1) {
                    if (strArr[j] == a) strArr[j] = b;
                }
            }
            System.out.println(String.valueOf(strArr));
        }
    }
}