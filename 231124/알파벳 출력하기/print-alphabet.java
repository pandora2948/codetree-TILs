import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), c = 'A';
        
        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <= i; j += 1) {
                System.out.print((char) c);
                c = (int) 'Z' < c + 1 ? (int) 'A' : c + 1;
            }
            System.out.println();
        }
    }
}