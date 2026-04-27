import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    static int f(int n, int d, int c) {
        if (n < 10) {
            return n * (int) Math.pow(d, c);
        }

        return f(n / 10, d, c + 1) + n % 10 * (int) Math.pow(d, c);
    }

    static void g(int n, int d) {
        if (n < d) {
            sb.append(n);
            return;
        }

        g(n / d, d);

        sb.append(n % d);
    }

    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()),
            b = Integer.parseInt(st.nextToken()),
            n = Integer.parseInt(br.readLine());

        g(f(n, a, 0), b);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}