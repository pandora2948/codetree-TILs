import java.util.Scanner;

public class Main {
    public static int getMin(int a, int b, int c) {
        int res = 0;
        
        if (a > b) {
            if (b >= c) {
                res = c;
            }
            else {
                res = b;
            }
        }
        else if (b > a) {
            if (a >= c) {
                res = c;
            }
            else {
                res = a;
            }
        }
        else if (b > a) {
            if (a >= b) {
                res = b;
            }
            else {
                res = a;
            }
        }
        else if (c > a){
            if (a >= b) {
                res = b;
            }
            else {
                res = a;
            }
        }
        else if (b > c) {
            if (c >= a) {
                res = a;
            }
            else {
                res = c;
            }
        }
        else {
            res = a;
        }
        

        return res;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        System.out.println(getMin(a, b, c));

    }
}