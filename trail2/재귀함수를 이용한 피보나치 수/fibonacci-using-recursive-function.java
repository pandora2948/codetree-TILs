import java.io.*;

public class Main {
    static int fibo(int n) {
        if (n < 3) return 1;

        return fibo(n-2) + fibo(n-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        
        int res = fibo(n);
        bw.write(String.valueOf(res));
        bw.flush();
        bw.close();
    }
}