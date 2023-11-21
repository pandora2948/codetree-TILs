import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cNum = 65, num = 0;

        for (int i = 0; i <= n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                if (n - i <= j) {
                    System.out.printf("%d ", num);
                    num = (num + 1) % 10;
                }
                else {
                    System.out.printf("%c ", (char) cNum); 
                    cNum = cNum >= 90 ? 65 : cNum + 1;
                }
            }
            System.out.println();
        }
    }
}