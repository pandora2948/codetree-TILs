import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] comb = new String[3];
        int cnt = 0;

        for (int i = 0; i < 3; i += 1) {
            comb[i] = sc.next();
        }

        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <= n; j += 1) {
                for (int k = 1; k <= n; k += 1) {
                    if(Math.abs(Integer.parseInt(comb[0]) - i) <= 2 || Math.abs(Integer.parseInt(comb[1]) - j) <= 2 ||
                        Math.abs(Integer.parseInt(comb[2]) - k) <= 2) {
                            cnt += 1;
                    }
                }
            }
        }
        System.out.println(cnt);
        
    }
}