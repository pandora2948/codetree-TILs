import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int res = n;
        char[] chArr = br.readLine().toCharArray();
        
        for (int i = 0; i < n; i += 1) {
            arr[i] = Integer.parseInt(String.valueOf(chArr[i]));
        }
        

        for (int i = 0; i < n; i += 1) {
            int[] arrCpy = Arrays.copyOf(arr, n);
            if (arrCpy[i] == 0) continue;

            for (int j = i + 1; j < n; j += 1) {
                if (arrCpy[j] == 1) {
                    arrCpy[(j - i) / 2] = 1;
                    break;
                }
            }

            int distance = n;
            for (int j = 0; j < n; j += 1) {
                if (arrCpy[j] == 0) continue;

                for (int k = j + 1; k < n; k += 1) {
                    if (arrCpy[k] == 0) continue;

                    distance = Math.min(distance, k - j + 1);
                    break;
                }
            }
            res = Math.min(res, distance);
        }

        System.out.println(res);
    }
}