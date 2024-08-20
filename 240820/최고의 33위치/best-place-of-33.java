import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int res = 0;
        int n = Integer.parseInt(br.readLine());
        int[][] tbl = new int[n][n];

        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j += 1) {
                tbl[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i <= n - 3; i += 1) {
            for (int j = 0; j <= n - 3; j += 1) {
                int sum = 0;

                for (int k = 0; k < 3; k += 1) {
                    sum += tbl[i][j + k] + tbl[i + k][j];
                    if (k != 0) sum += tbl[i + k][j + k];
                }

                res = Math.max(res, sum);
            }
        }

        bw.write(String.valueOf(res));
        bw.flush();
    }
}