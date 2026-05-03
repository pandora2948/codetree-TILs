import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()),
            t = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i += 1) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0,
            maxCnt = 0;
        for (int i = 0; i < n; i += 1) {
            if (arr[i] > t) cnt += 1;
            else cnt = 0;
            maxCnt = Math.max(maxCnt, cnt);
        }
        bw.write(String.valueOf(maxCnt));
        bw.flush();
        bw.close();
    }
}
