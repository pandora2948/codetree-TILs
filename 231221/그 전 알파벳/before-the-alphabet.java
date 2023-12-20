import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int c = (int) sc.next().charAt(0);

        c = c < 98 ? 122 : c - 1;
        System.out.println((char) c);
    }
}