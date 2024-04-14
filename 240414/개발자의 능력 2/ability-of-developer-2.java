import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        final int MAX_N = 6;
        int diff = Integer.MAX_VALUE;

        Integer[] arr = new Integer[MAX_N];

        for (int i = 0; i < MAX_N; i += 1) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < MAX_N; i += 1) {
            for (int j = 0; j < MAX_N; j += 1) {
                for (int k = 0; k < MAX_N; k += 1) {
                    for (int l = 0; l < MAX_N; l += 1) {
                        if (i == j || j == k || k == l || l == i || j == l || k == i) continue;
                        Integer[] sums = new Integer[3];
                        Integer[] arrPrime = arr.clone();

                        sums[0] = arrPrime[i] + arrPrime[j];
                        arrPrime[i] = 0;
                        arrPrime[j] = 0;

                        sums[1] = arr[k] + arr[l];
                        arrPrime[k] = 0;
                        arrPrime[l] = 0;

                        sums[2] = 0;
                        for (int m = 0; m < MAX_N; m += 1) {
                            if (arrPrime[m] != 0) {
                                sums[2] += arrPrime[m];
                                arrPrime[m] = 0;
                            }
                        }

                        Arrays.sort(sums);
                        diff = Math.min(diff, sums[2] - sums[0]);

                    }
                }
            }
        }
        System.out.println(diff);
    }
}