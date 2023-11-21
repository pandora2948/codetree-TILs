import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 9;
        
        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                System.out.print(cnt);
                cnt = cnt - 1 == 0 ? 9 : cnt - 1;
            }
            System.out.println();
        }
    }
}