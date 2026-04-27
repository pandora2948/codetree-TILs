import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] lines = new int[200 + 1];

        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken()) + 100,
                b = Integer.parseInt(st.nextToken()) + 100;

            for (int j = a; j < b; j += 1) {
                lines[j - 1] += 1;
            }
        }

        int res = 0;

        for (int i = 0; i < 200; i += 1) {
            res = Math.max(res, lines[i]);
        }

        bw.write(String.valueOf(res));
        bw.flush();
        bw.close();
    }
}