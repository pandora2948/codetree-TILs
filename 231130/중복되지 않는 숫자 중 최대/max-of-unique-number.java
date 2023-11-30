import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), maxVal = -1;
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i += 1) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i += 1) {
            int cnt = 0;
            for (int j = 0; j < n; j += 1) {
                cnt = arr[i] == arr[j] ? cnt + 1 : cnt;
            }

            if (cnt < 2 && maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }
        System.out.println(maxVal);
    }
}