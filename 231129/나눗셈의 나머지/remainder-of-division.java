import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int a = sc.nextInt(), b = sc.nextInt(), sum = 0;
        
        while (a > 1) {
            arr[a % b] += 1;
            a /= b;
        }
        
        for (int i = 0; i < 5; i += 1) {
            sum += Math.pow(arr[i], 2);
        }
        System.out.print(sum);
    }
}