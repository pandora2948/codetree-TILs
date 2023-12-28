import java.util.Scanner;

public class Main {
    public static int countMagicNumgers(int a, int b) {
        int cnt = 0;
        for (int i = a; i <= b; i += 1) {
            boolean isPrime = true;
            int sum = 0;
            int iPrime = i;
            
            for (int j = i - 1; j > 1; j -= 1) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (!isPrime) continue;

            while (iPrime > 0) {
                sum += iPrime % 10;
                iPrime /= 10;
            }

            if (sum % 2 == 0) cnt += 1;

        }
        return cnt;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(countMagicNumgers(a, b));

    }
}