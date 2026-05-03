import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()),
            m = Integer.parseInt(st.nextToken());

        final int MAX_T = 1000000;
        int[] arrA = new int[MAX_T];
        int[] arrB = new int[MAX_T];

        int[] times = new int[] {1, 1};
        
        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());

            int v = Integer.parseInt(st.nextToken()),
                t = Integer.parseInt(st.nextToken());
            
            for (int j = 0; j < t; j += 1) {
                arrA[times[0]] = arrA[times[0] - 1] + v;
                times[0] += 1;
            }
        }

        for (int i = 0; i < m; i += 1) {
            st = new StringTokenizer(br.readLine());

            int v = Integer.parseInt(st.nextToken()),
                t = Integer.parseInt(st.nextToken());
            
            for (int j = 0; j < t; j += 1) {
                arrB[times[1]] = arrB[times[1] - 1] + v;
                times[1] += 1;
            }
        }

        int lead = 0;
        int cnt = 0;

        for (int i = 1; i < times[0]; i += 1) {
            if (arrA[i] > arrB[i] && lead != 1) {
                lead = 1;
                cnt += 1;
            }
            else if (arrA[i] < arrB[i] && lead != 2) {
                lead = 2;
                cnt += 1;
            }
        }

        bw.write(String.valueOf(cnt - 1));
        bw.flush();
        bw.close();
    }
}