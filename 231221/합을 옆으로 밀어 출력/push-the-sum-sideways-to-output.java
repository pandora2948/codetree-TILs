import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        String res;

        for (int i = 0; i < n; i += 1) {
            sum += sc.nextInt();
        }

        res = Integer.toString(sum);
        res = res.substring(1).concat(res.substring(0, 1));
        
        System.out.println(res);
    }
}