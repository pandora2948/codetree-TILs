import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a1, a2, b1, b2;
        a1 = sc.nextInt();
        a2 = sc.nextInt();
        b1 = sc.nextInt();
        b2 = sc.nextInt();

        if (a1 == b1) {
            System.out.println(a2 > b2 ? "A" : "B");
        }
        else {
            System.out.println(a1 > b1 ? "A" : "B");
        }
    }
}