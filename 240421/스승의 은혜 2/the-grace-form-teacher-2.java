import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int cost = 0;
        int res = 0;

        Integer[] arr = new Integer[n];
        
        for (int i = 0; i < n; i += 1) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i += 1) {
            if (cost + arr[i] > b) {
                if (cost + (arr[i] / 2) <= b) {
                    res = i + 1;
                    break;
                }
                else {
                    res = i;
                    break;
                }
            }

            cost += arr[i];
        }

        System.out.println(res);
    }
}