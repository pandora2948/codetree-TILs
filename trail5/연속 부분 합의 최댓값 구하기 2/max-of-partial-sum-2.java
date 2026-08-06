import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[] arr;

        final int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i += 1) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int total = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i += 1) {
            total += arr[i];
            max = Math.max(max, total);
            if (total < 0) total = 0;
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}
