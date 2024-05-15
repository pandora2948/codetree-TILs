import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int res = 0;

        for (int i = 0; i < 1000; i += 1) {
            for (int j  = 0; j < 1000; j += 1) {
                int sum = (a * i) + (b * j);
                if (sum > c) break;

                res = Math.max(res, sum);
            }
        }
        System.out.println(res);
    }
}