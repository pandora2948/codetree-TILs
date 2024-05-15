import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i += 1) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i += 1) {
            int[] arrPrime = Arrays.copyOf(arr, n);
            arrPrime[i] *= 2;

            for (int j = 0; j < n; j += 1) {
                int sum = 0;

                for (int k = 0; k < n - 1; k += 1) {
                    if (k == j || k + 1 == j) continue;
                    
                    sum += Math.abs(arrPrime[k] - arrPrime[k + 1]);
                }
                result = Math.min(result, sum);
            }
        }
        System.out.println(result);
    }
}