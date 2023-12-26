import java.util.Scanner;

public class Main {
    public static int getMin(int a, int b, int c) {
        int res = a;

        res = b > res ? res : b;
        res = c > res ? res : c;
        
        return res;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        System.out.println(getMin(a, b, c));

    }
}