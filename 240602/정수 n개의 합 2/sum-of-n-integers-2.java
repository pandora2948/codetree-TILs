import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{       
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int res = 0;
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i += 1) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n - k; i += 1) {
            int sum = 0;
            for (int j = i; j < i + k; j += 1) {
                sum += arr[j];
            }

            res = Math.max(res, sum);
        }

        bw.write(String.valueOf(res));
        bw.newLine();
        bw.flush();
        bw.close();
    }
}