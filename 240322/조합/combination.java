import java.util.Scanner;

public class Main {
    public static int getCombi(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        }
        return getCombi(n - 1, r - 1) + getCombi(n - 1, r);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(getCombi(n, m));
    }
}