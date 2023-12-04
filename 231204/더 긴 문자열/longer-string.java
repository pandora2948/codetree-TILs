import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String firstWord = sc.next();
        String secondWord = sc.next();
        int firstLen = firstWord.length();
        int secondLen = secondWord.length();

        if (firstLen == secondLen) {
            System.out.println("same");
        }
        else if (firstLen > secondLen) {
            System.out.printf("%s %d", firstWord, firstLen);
        }
        else if (firstLen < secondLen) {
            System.out.printf("%s %d", secondWord, secondLen);
        }
    }
}