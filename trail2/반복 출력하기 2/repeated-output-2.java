import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static void f(int n) {
        if (n == 0) return;

        sb.append("HelloWorld").append('\n');
        f(n-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        f(Integer.parseInt(br.readLine()));
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}