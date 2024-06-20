import java.io.*;

public class Main {
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void compare(int num) throws IOException {
        if (num == 369) {
            bw.write(String.valueOf(num) + " ");
        }

        if (num < 369) {
            bw.write(String.valueOf(num) + " ");
            compare(num + 2);
        }
        
        if (num > 369) {
            compare(num - 2);
            bw.write(String.valueOf(num) + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        compare(n);

        bw.flush();
        bw.close();
    }
}