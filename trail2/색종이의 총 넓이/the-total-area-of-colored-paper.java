import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        final int OFFSET = 100;
        final int MAX_W = 201;

        int[][] grid = new int[MAX_W + 1][MAX_W + 1];

        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken()) + OFFSET,
                y = Integer.parseInt(st.nextToken()) + OFFSET;

            for (int j = x; j < x + 8; j += 1) {
                for (int k = y; k < y + 8; k += 1) {
                    grid[j][k] = 1;
                }
            }
        }

        int cnt = 0;

        for (int i = 0; i < MAX_W; i += 1) {
            for (int j = 0; j < MAX_W; j += 1) {
                if (grid[i][j] > 0) cnt += 1;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();



    }
}