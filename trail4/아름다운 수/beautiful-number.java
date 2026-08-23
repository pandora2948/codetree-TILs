import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] cnt = new int[10];
        cnt[0] = 1;
        cnt[1] = 2;
        cnt[2] = 4;
        cnt[3] = 8;

        for (int i = 4; i < n; i += 1) {
            for (int j = i - 4; j < i; j += 1) {
                cnt[i] += cnt[j];
            }
            
        }
        
        // res = 1 | res = 2 | res = 4 | res = 8 | res = 15 | res = 29 | res = 56

        bw.write(String.valueOf(cnt[n-1]));
        bw.flush();
        bw.close();
        
        
    }
}