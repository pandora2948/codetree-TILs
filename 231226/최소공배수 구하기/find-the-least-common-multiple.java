import java.util.Scanner;

public class Main {
    public static int getCM(int n, int m) {
        int nPrime = n;
        int mPrime = m;
        while (n != m) {
            if (n > m) {
                m += mPrime;
            }
            else {
                n += nPrime;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(getCM(n, m));
    }
}