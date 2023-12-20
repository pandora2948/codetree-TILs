import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int c1 = (int) sc.next().charAt(0);
        int c2 = (int) sc.next().charAt(0);

        System.out.printf("%d %d", c1 + c2, Math.abs(c1 - c2));
    }
}