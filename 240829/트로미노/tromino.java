import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] tbl = new int[n][m];
        int max = 0;
        
        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j += 1) {
                tbl[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n - 1; i += 1) {
            for (int j = 0; j < n - 1; j += 1) {
                int sum = tbl[i][j] + tbl[i + 1][j] +tbl[i][j + 1] + tbl[i + 1][j + 1];
                int[] res = new int[]{sum - tbl[i][j], sum - tbl[i + 1][j], sum - tbl[i][j + 1], sum - tbl[i + 1][j + 1]};
                max = Math.max(max, Arrays.stream(res).max().orElse(0));
            }
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < m - 2; j += 1) {
                max = Math.max(max, 
                    Arrays.stream(Arrays.copyOfRange(tbl[i], j, j + 2))
                                    .max()
                                    .orElse(0));
            }
        }

        for (int i = 0; i < m; i += 1) {
            int sum = 0;
            for (int j = 0; j < n - 2; j += 1) {
                sum += tbl[j][i] + tbl[j + 1][i] + tbl[j + 2][i];
            }
            max = Math.max(max, sum);
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}