import java.io.*;
import java.util.*;

public class Main {
    static final int MAX_W = 200;
    static int[][] grid = new int[MAX_W + 1][MAX_W + 1];

    static void paint(int[] pos, int num) {
        for (int i = pos[0]; i < pos[2]; i += 1) {
            for (int j = pos[1]; j < pos[3]; j += 1) {
                grid[i][j] = num % 2 + 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        final int OFFSET = 100;
        int n = Integer.parseInt(br.readLine());        

        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());
            int[] pos = new int[4];

            for (int j = 0; j < 4; j += 1) {
                pos[j] = Integer.parseInt(st.nextToken()) + OFFSET;
            }

            paint(pos, i);
        }

        int cnt = 0;

        for (int i = 0; i < MAX_W; i += 1) {
            for (int j = 0; j < MAX_W; j += 1) {
                if (grid[i][j] == 2) {
                    cnt += 1;
                }
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}