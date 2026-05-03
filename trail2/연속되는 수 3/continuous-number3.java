import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i += 1) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0,
            maxCnt = 0;

        for (int i = 0; i < n; i += 1) {
            if (i == 0 || (arr[i] < 0 && arr[i - 1] < 0) || (arr[i] > 0 && arr[i - 1] > 0)) {
                cnt += 1;
            }
            else {
                cnt = 1;
            }
            maxCnt = Math.max(maxCnt, cnt);
        }
        bw.write(String.valueOf(maxCnt));
        bw.flush();
        bw.close();
    }
}