import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;

        for (int i = 0; i < n; i += 1) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = i; j < n; j += 1) {
                int sum = 0;
                for (int k = i; k <= j; k += 1) {
                    sum += arr[k];
                }
                double avg = (double) sum / (j - i + 1);

                for (int k = i; k <= j; k += 1) {
                    if (avg == (double) arr[k]) {
                        cnt += 1;
                        break;
                    }
                }
            }
        }

        System.out.println(cnt);

         
    }
}