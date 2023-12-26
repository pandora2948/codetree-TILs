import java.util.Scanner;

public class Main {
    public static boolean checkEven(int n) {
        return n % 2 == 0;
    }
    
    public static boolean checkExpr(int n) {
        return ((n / 10) + (n % 10)) % 5 == 0;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(checkEven(n) && checkExpr(n) ? "Yes" : "No");


    }
}