import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] intArr = new Integer[n];
        for (int i = 0; i < n; i += 1) {
            intArr[i] = sc.nextInt();
        }

        Arrays.sort(intArr);
        System.out.print(intArr[k - 1]);
    }
}