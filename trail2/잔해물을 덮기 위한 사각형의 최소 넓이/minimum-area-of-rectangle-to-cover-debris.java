import java.io.*;
import java.util.*;

public class Main {
    static void paint(int[][] grid, int[] pos, boolean isCover) {
        for (int i = pos[0]; i < pos[2]; i += 1) {
            for (int j = pos[1]; j < pos[3]; j += 1) {
                grid[i][j] = isCover ? 0 : 1;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        final int MAX_W = 2000;
        final int OFFSET = 1000;

        int[][] grid = new int[MAX_W + 1][MAX_W + 1];

        for (int i = 0; i < 2; i += 1) {
            st = new StringTokenizer(br.readLine());
            int[] pos = new int[4];

            for (int j = 0; j < 4; j += 1) {
                pos[j] = Integer.parseInt(st.nextToken()) + OFFSET;
            }

            if (i == 1) paint(grid, pos, true);
            else paint(grid, pos, false);
        }

        int[] coverPos = new int[4];
        coverPos[0] = Integer.MAX_VALUE;
        coverPos[1] = Integer.MAX_VALUE;

        int cnt = 0;

        for (int i = 0; i < MAX_W; i += 1) {
            for (int j = 0; j < MAX_W; j += 1) {
                if (grid[i][j] == 1) {
                    coverPos[0] = Math.min(coverPos[0], i);
                    coverPos[1] = Math.min(coverPos[1], j);
                    coverPos[2] = Math.max(coverPos[2], i);
                    coverPos[3] = Math.max(coverPos[3], j);
                    cnt += 1;
                }
            }
        }
        if (cnt == 0) {
            bw.write(String.valueOf(0));
        }
        else {
            bw.write(String.valueOf((coverPos[3] - coverPos[1] + 1) * (coverPos[2] - coverPos[0] + 1)));
        }
        bw.flush();
        bw.close();
    }
}