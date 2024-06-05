import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cnt = 3000;

        for (int i = n / 5; i >= 0; i -= 1) {
            int cur = n - (5 * i);

            for (int j = 0; j <= n / 3; j += 1) {
                if (cur - (3 * j) == 0) {
                    cnt = Math.min(cnt, i + j);
                }
            }
        }

        bw.write(cnt == 10000 ? String.valueOf(-1) : String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}