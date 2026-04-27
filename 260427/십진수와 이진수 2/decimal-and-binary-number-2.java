import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int f(int n, int c) {
        if (n < 10) {
            return n * (int) Math.pow(2, c);
        }

        return f(n / 10, c + 1) + n % 2 * (int) Math.pow(2, c);
    }

    static void g(int n) {
        if (n < 2) {
            sb.append(n);
            return;
        }

        g(n / 2);
        sb.append(n % 2);
    }

    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int res = f(n, 0) * 17;
        g(res);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}