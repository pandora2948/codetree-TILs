import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int res = 0;
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
                for (int k = i; k < i + 3; k += 1) {
                    for (int l = j; l < j + 3; l += 1) {
                        sum += tbl[k][l];
                    }
                }
                res = Math.max(res, sum);
            }
        }
        bw.write(String.valueOf(res));
        bw.flush();
    }
}