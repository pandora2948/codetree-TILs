import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i += 1) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                int sum = 0;
                if (i == j) continue;

                for (int k = 0; k < n - 1; k += 1) {
                    if (k == j) continue;
                    
                    if (k + 1 == i) {
                        sum += Math.abs(arr[k] - (arr[k + 1] * 2));
                    }
                    else if (k == i) {
                        sum += Math.abs((arr[k] * 2) - arr[k + 1]);
                    }
                    else {
                        sum += Math.abs(arr[k] - arr[k + 1]);
                    }

                }

                min = Math.min(min, sum);
            }

        }
        System.out.println(min);
    }
}