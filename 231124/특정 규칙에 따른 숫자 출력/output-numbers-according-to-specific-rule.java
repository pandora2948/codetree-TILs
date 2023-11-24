import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 1;
        
        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                if (i > j) {
                    System.out.print("  ");
                }
                else {
                    System.out.printf("%d ", cnt);
                    cnt = cnt + 1 > 9 ? 1 : cnt + 1;
                }
            }
            System.out.println();
        }
    }
}