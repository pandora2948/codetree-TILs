import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        System.out.println(y % 4 == 0 && (y % 100 == 0 && y % 400 == 0 || y % 100 != 0) ? "true" : "false");
    }
}