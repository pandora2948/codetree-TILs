import java.io.*;

public class Main {
    static int f(int n) {
        if (n == 0 || n == 1) return 1;

        return f(n-1) * n;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(f(n)));
        bw.flush();
        bw.close();
    }
}