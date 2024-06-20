import java.io.*;

public class Main {
    public static int mult(int c) {
        if (c == 0) {
            return 1;
        }

        return 3 * mult(c - 1);
    }

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(mult(n)));
        bw.flush();
        bw.close();
    }
}