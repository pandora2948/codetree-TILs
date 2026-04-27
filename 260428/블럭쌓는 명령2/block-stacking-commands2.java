import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()),
            k = Integer.parseInt(st.nextToken());

        Integer[] blk = new Integer[n];

        for (int i = 0; i < n; i += 1) {
            blk[i] = 0;
        }

        for (int i = 0; i < k; i += 1) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken()),
                b = Integer.parseInt(st.nextToken());

            for (int j = a; j <= b; j += 1) {
                blk[j - 1] += 1;
            }
        }

        Arrays.sort(blk, Collections.reverseOrder());
        
        bw.write(String.valueOf(blk[0]));
        bw.flush();
        bw.close();
    }
}