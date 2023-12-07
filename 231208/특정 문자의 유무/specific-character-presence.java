import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String firstOption = str.contains("ee") ? "Yes" : "No";
        String secondOption = str.contains("ab") ? "Yes" : "No";

        System.out.printf("%s %s", firstOption, secondOption);
    }
}