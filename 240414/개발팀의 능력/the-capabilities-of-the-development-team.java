import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        final int MAX_N = 5;
        int[] arr = new int[MAX_N];
        int diff = 10000;

        for (int i = 0; i < MAX_N; i += 1) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < MAX_N; i += 1) {
            for (int j = 0; j < MAX_N; j += 1) {
                for (int k = 0; k < MAX_N; k += 1) {
                    if (i == j || j == k || k == i) continue;
                    Integer[] arrPrime = Arrays.stream(arr.clone()).boxed().map(x -> x).toArray(Integer[]::new);

                    Integer[] sums = new Integer[3];
                    sums[0] = arr[i] + arr[j];
                    sums[1] = arr[k];
                    sums[2] = 0;

                    arrPrime[i] = 0;
                    arrPrime[j] = 0;
                    arrPrime[k] = 0;

                    for (int l = 0; l < MAX_N; l += 1) {
                        if (arrPrime[l] != 0) {
                            sums[2] += arrPrime[l];
                            arrPrime[l] = 0;
                        }
                    }

                    Arrays.sort(sums);

                    if (sums[0] == sums[1] || sums[1] == sums[2] || sums[0] == sums[2]) continue;

                    diff = Math.min(diff, sums[2] - sums[0]);

                }
            }
        }
        System.out.println(diff == 10000 ? -1 : diff);
    }
}