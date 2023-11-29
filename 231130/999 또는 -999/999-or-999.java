import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        final int INT_MIN = Integer.MIN_VALUE, INT_MAX = Integer.MAX_VALUE;
        int maxVal = INT_MIN, minVal = INT_MAX;

        for (int i = 0; i < 100; i += 1) {
            int n = sc.nextInt();
            if (Math.abs(n) == 999) break;
            minVal = minVal > n ? n : minVal;
            maxVal = maxVal < n ? n : maxVal;
        }

        System.out.printf("%d %d", maxVal, minVal);

    }
}