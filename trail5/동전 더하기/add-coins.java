import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int cnt = 0;
        Integer[] coins = new Integer[N];

        for (int i = N - 1; i >= 0; i -= 1) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        for (int c : coins) {
            cnt += K / c;
            K %= c;
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}