import java.io.*;

public class Main {
    public static int rec(int num) {
        if (num == 1) return 2;
        else if (num == 2) return 4;

        return (rec(num - 1) * rec(num - 2)) % 100;
    }

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(rec(n)));
        bw.flush();
        bw.close();
    }
}