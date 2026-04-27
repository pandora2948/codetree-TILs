import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] lines = new int[100];

        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken()),
                b = Integer.parseInt(st.nextToken());
            
            for (int j = a; j <= b; j += 1) {
                lines[j] += 1;
            }
        }

        int max = 0;
        for (int i = 0; i < 100; i += 1) {
            max = Math.max(max, lines[i]);
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();

    }
}