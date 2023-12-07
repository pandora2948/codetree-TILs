import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int firstCnt = 0, secondCnt = 0;
        
        for (int i = 0; i < str.length() - 1; i += 1) {
            firstCnt += String.valueOf(str.charAt(i)).concat(String.valueOf(str.charAt(i + 1))).equals("ee") ? 1 : 0;
            secondCnt += String.valueOf(str.charAt(i)).concat(String.valueOf(str.charAt(i + 1))).equals("eb") ? 1 : 0;
        }

        System.out.printf("%d %d", firstCnt, secondCnt);
    }
}