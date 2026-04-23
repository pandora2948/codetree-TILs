import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int len = n * 2;
        int[] arr = new int[len];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < len; i += 1) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int res = 0;

        for (int i = 0; i < 2; i += 1) {
            int sum = 0;
            for (int j = 0; j < n; j += 1) {
                sum += arr[i + j];
            }
            res = Math.max(res, sum);
        }

        bw.write(String.valueOf(res));
        bw.flush();
        bw.close();

    }
}