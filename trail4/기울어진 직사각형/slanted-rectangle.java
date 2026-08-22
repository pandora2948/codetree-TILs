import java.util.*;
import java.io.*;

public class Main {
    static int[][] grid;
    static int n;

    static int searchArea(int r, int c) {
    int[][] direction = {
        {-1, 1},
        {-1, -1},
        {1, -1},
        {1, 1}
    };

    int max = 0;

    // 1번 방향으로 이동할 거리
    for (int a = 1; a < n; a++) {

        // 2번 방향으로 이동할 거리
        for (int b = 1; b < n; b++) {

            int nr = r;
            int nc = c;
            int total = grid[r][c];
            boolean possible = true;

            int[] distance = {a, b, a, b};

            for (int d = 0; d < 4; d++) {

                for (int step = 0; step < distance[d]; step++) {

                    nr += direction[d][0];
                    nc += direction[d][1];

                    // 격자 밖으로 나가면 이 사각형은 불가능
                    if (nr < 0 || nr >= n || nc < 0 || nc >= n) {
                        possible = false;
                        break;
                    }

                    // 마지막 이동은 시작점으로 돌아오는 것
                    // 시작점 값은 이미 더했으므로 다시 더하지 않음
                    if (!(d == 3 && step == distance[d] - 1)) {
                        total += grid[nr][nc];
                    }
                }

                if (!possible) break;
            }

            if (possible) {
                max = Math.max(max, total);
            }
        }
    }

    return max;
}
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());

        int res = 0;

        grid = new int[n][n];

        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j += 1) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                res = Math.max(res, searchArea(i, j));
            }
        }

        bw.write(String.valueOf(res));
        bw.flush();
        bw.close();


        // Please write your code here.
    }
}