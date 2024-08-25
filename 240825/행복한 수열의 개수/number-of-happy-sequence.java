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
            int[] rowCnt = new int[100];

            Arrays.stream(tbl[i]).forEach(e -> rowCnt[e - 1] += 1);
            int max = Arrays.stream(rowCnt).max().getAsInt();
            if (max >= m) cnt += 1;
        }

        for (int i = 0; i < n; i += 1) {
            int[] colCpy = new int[n];
            int[] colCnt = new int[100];
            for (int j = 0; j < n; j += 1) {
                colCpy[j] = tbl[i][j];
            }
            Arrays.stream(colCpy).forEach(e -> colCnt[e - 1] += 1);
            int max = Arrays.stream(colCnt).max().getAsInt();
            
            if (max >= m) cnt += 1;
        }
        
        bw.write(String.valueOf(cnt));
        bw.flush();
        


    }
}