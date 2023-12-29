import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] strs = new String[5];
        int maxLen = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i += 1) {
            strs[i] = sc.next();
            maxLen = Math.max(strs[i].length(), maxLen);
        }

        for (int i = 0; i < maxLen; i += 1) {
            for (int j = 0; j < 5; j += 1) {
                try {
                    System.out.print(strs[j].charAt(i));
                }
                catch (Exception e) {
                    continue;
                }
            }
        }
    }
}