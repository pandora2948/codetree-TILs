import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        int[] strLens = {str1.length(), str2.length(), str3.length()};
        int maxLen = Integer.MIN_VALUE;
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i += 1) {
            int len = strLens[i];
            maxLen = maxLen < len ? len : maxLen;
            minLen = minLen > len ? len : minLen;
        }
        System.out.println(maxLen - minLen);
    }
}