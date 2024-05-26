import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int res = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i += 1) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i += 1) {
            int sum = 0;
            int idx = i;

            for (int j = 0; j < m; j += 1) {
                sum += arr[idx];
                idx = arr[idx] - 1;
            }
            res = Math.max(res, sum);
        }
        System.out.println(res);

    }
}