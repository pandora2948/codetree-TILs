import java.io.*;
import java.util.*;

public class Main {
    static int k, n;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    static void bt(int r, String s) {
        if (r >= n) {
            for (int i = 0; i < s.length(); i += 1) {
                sb.append(s.charAt(i)).append(' ');
            }

            sb.append('\n');
            return;
        }

        for (int i = 1; i <= k; i += 1) {
            bt(r+1, s.concat(String.valueOf(i)));
        }

        
    }

    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        bt(0, "");
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}