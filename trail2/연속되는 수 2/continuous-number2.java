import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        
        int cnt = 0;
        int maxCnt = 0;
        int prv = 0;
        
        for (int i = 0; i < n; i += 1) {
            int cur = Integer.parseInt(br.readLine());

            if (i == 0 || prv == cur) {
                cnt += 1;
            }
            else {
                maxCnt = Math.max(maxCnt, cnt);
                cnt = 1;
            }
            prv = cur;
        }

        maxCnt = Math.max(maxCnt, cnt);

        bw.write(String.valueOf(maxCnt));
        bw.flush();
        bw.close();
    }
}