import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int[] arrA = new int[n];

        for (int i = 0; i < n; i += 1) {
            arrA[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arrB = new int[m];
        int[] res = new int[n - m];

        for (int i = 0; i < m ; i += 1) {
            arrB[i] = sc.nextInt();
        }
        Arrays.sort(arrB);

        for (int i = 0; i < n - m + 1; i += 1) {
            int[] tarArray = Arrays.copyOfRange(arrA, i, i + m);
            Arrays.sort(tarArray);
            int diff = tarArray[0] - arrB[0];
            boolean isBeauty = true;

            for (int j = 0; j < m; j += 1) {
                if (tarArray[j] - arrB[j] != diff) {
                    isBeauty = false;
                    break;
                }
            }

            if (isBeauty) {
                res[cnt] = i + 1;
                cnt += 1;
            }
        }

        System.out.println(cnt);

        for (int i = 0; i < cnt; i += 1) {
            System.out.println(res[i]);
        }

    }
}