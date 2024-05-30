import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        char[][] tbl = new char[n][m];

        for (int i = 0; i < n; i += 1) {
            tbl[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < n; i += 1) {
            for (int p = 0; p < k; p += 1) {
                for (int j = 0; j < m; j += 1) {
                    for (int l = 0; l < k; l += 1) {
                        bw.write(tbl[i][j]);
                    }
                }
                bw.newLine();
            }
        }
        
        bw.flush();
        bw.close();
    }
}