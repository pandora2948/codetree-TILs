import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), cnt = 0;
        
        for (int i = 0; i < n; i += 1) {
            int a = sc.nextInt();
            cnt = a == m ? cnt + 1 : cnt;
        }
        System.out.print(cnt);
    }
}