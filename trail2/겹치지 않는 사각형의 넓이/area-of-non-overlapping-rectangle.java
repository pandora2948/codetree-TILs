import java.io.*;
import java.util.*;

class Main {
    static void paint(int[][] grid, int[] pos, boolean isFinal) {
        for (int i = pos[0]; i < pos[2]; i += 1) {
            for (int j = pos[1]; j < pos[3]; j += 1) {
                if (isFinal) {
                    grid[i][j] = 0;
                }
                else {
                    grid[i][j] = 1;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        final int MAX_W = 2001;
        final int OFFSET = 1000;

        int[][] grid = new int[MAX_W][MAX_W];

        for (int i = 0; i < 3; i += 1) {
            st = new StringTokenizer(br.readLine());
            int[] pos = new int[4];

            for (int j = 0; j < 4; j += 1) {
                pos[j] = Integer.parseInt(st.nextToken()) + OFFSET;
            }

            if (i != 2) paint(grid, pos, false);
            else paint(grid, pos, true);
        }

        int cnt = 0;

        for (int i = 0; i < MAX_W; i += 1) {
            for (int j = 0; j < MAX_W; j += 1) {
                if (grid[i][j] == 1) cnt += 1;
            }
        }
        
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();

    }
}