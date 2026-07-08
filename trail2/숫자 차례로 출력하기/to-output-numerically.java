import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static void f(int n) {
        if (n == 0) return;
        
        f(n-1);
        sb.append(String.valueOf(n)).append(' ');
    }

    static void g(int n) {
        if (n == 0) return;
        sb.append(String.valueOf(n)).append(' ');
        g(n-1);
    }

    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        f(n);
        sb.append('\n');
        g(n);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}