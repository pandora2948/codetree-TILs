import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int offset = 100;
        
        int[][] grid = new int[201][201];

        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken()) + offset,
                y1 = Integer.parseInt(st.nextToken()) + offset,
                x2 = Integer.parseInt(st.nextToken()) + offset,
                y2 = Integer.parseInt(st.nextToken()) + offset;

            for (int j = x1; j < x2; j += 1) {
                for (int k = y1; k < y2; k += 1) {
                    grid[j][k] = 1;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < grid.length; i += 1) {
            for (int j = 0; j < grid[i].length; j += 1) {
                if (grid[i][j] == 1) cnt += 1;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}