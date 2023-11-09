import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if (a > b && a > c) {
            if (b > c) System.out.println(b);
            else System.out.println(c);
        }
        else if (b > a && b > c) {
            if (a > c) System.out.println(a);
            else System.out.println(c);
        }
        else {
            if (a > b) System.out.println(a);
            else System.out.println(b);
        }
    }
}