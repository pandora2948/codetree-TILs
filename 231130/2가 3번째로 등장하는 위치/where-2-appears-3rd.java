import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0, idx = -1;
        int[] arr = new int[n];

        for (int i = 0; i < n; i += 1) {
            arr[i] = sc.nextInt();
            
            if (arr[i] == 2) {
                cnt += 1;
            }

            if (cnt > 2) {
                idx = i;
                break;
            }
        }
        System.out.print(idx + 1);

    }
}