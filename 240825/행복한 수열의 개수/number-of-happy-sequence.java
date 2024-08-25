import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;

        int[][] tbl = new int[n][n];

        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j += 1) {
                tbl[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i += 1) {
            int rowCnt = 1;
            int rowMax = 1;

            for (int j = 0; j < n - 1; j += 1) {
                if (tbl[i][j] == tbl[i][j + 1]) {
                    rowCnt += 1;
                    rowMax = Math.max(rowMax, rowCnt);
                }
                else rowCnt = 0;

                if (rowMax >= m) cnt += 1;
            }
        }

        for (int i = 0; i < n; i += 1) {
            int colCnt = 1;
            int colMax = 1;

            for (int j = 0; j < n - 1; j += 1) {
                if (tbl[j][i] == tbl[j + 1][i]) {
                    colCnt += 1;
                    colMax = Math.max(colMax, colCnt);
                }
                else colCnt = 0;

                if (colMax >= m) cnt += 1;

            }
        }
        
        bw.write(String.valueOf(cnt));
        bw.flush();

    }
}