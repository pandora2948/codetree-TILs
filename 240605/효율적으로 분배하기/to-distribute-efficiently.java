import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cnt = 10000;

        for (int i = 1; i <= n / 5; i += 1) {
            for (int j = 1; j <= n / 3; j += 1) {
                int c = 0;
                int cur = n;

                cur = cur - (5 * i) - (3 * j);
                c = i + j;
                
                if (cur == 0) {
                    cnt = Math.min(cnt, c);
                }
            }
        }

        bw.write(cnt == 10000 ? String.valueOf(-1) : String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}