import java.util.Scanner;

public class Main {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int min(int a, int b) {
        return a - b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String query = sc.nextLine();
        String[] arg = query.split(" ");
        StringBuilder res = new StringBuilder(query);
        int a = Integer.parseInt(arg[0]), b = Integer.parseInt(arg[2]);
        char o = arg[1].charAt(0);

        switch (o) {
            case '+':
                res.append(" = " + sum(a, b));
                break;
            
            case '-':
                res.append(" = " + min(a, b));
                break;
            
            case '/':
                res.append(" = " + div(a, b));
                break;
            
            case '*':
                res.append(" = " + mul(a, b));
                break;

            default:
                res = new StringBuilder("False");
                break;
        }

        System.out.println(res.toString());

    }
}