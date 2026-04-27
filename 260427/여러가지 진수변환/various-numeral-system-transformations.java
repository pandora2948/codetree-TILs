import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    static void f(int n, int d) {
        if (n < d) {
            sb.append(n);
            return;
        }

        f(n / d, d);

        sb.append(n % d);
    }

    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int bi = Integer.parseInt(st.nextToken()),
            demension = Integer.parseInt(st.nextToken());

        f(bi, demension);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }
}