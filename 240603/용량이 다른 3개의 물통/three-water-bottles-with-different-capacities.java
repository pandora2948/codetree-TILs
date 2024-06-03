import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[][] b = new int[3][2];

        for (int i = 0; i < 3; i += 1) {
            st = new StringTokenizer(br.readLine());
            b[i][0] = Integer.parseInt(st.nextToken());
            b[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= 100; i += 1) {
            int cur = (i - 1) % 3;
            int nxt = i % 3;

            if (b[nxt][0] > b[nxt][1] + b[cur][1]) {
                b[nxt][1] += b[cur][1];
                b[cur][1] = 0;
            }
            else {
                b[cur][1] = b[cur][1] - (b[nxt][0] - b[nxt][1]);
                b[nxt][1] = b[nxt][0];
            }
        }
        
        for (int[] bucket : b) {
            bw.write(String.valueOf(bucket[1]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}