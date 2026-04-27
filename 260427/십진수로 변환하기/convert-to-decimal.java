import java.io.*;
import java.util.*;

public class Main {
    static int f(int n, int d) {
        if (n < 10) {
            return n * (int) Math.pow(2, d);
        }

        return f(n / 10, d + 1) + n % 10 * (int) Math.pow(2, d);
    }

    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int bi = Integer.parseInt(br.readLine());
        
        bw.write(String.valueOf(f(bi, 0)));
        bw.flush();
        bw.close();
    }
}