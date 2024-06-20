import java.io.*;
import java.util.*;

public class Main {
    public static int mult(int n, int c) {
        if (c == 0) {
            return 1;
        }

        return n * mult(n, c - 1);
    }

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int firstOption = mult(a, b);
        int secondOption = mult(b, a);

        if (firstOption < secondOption) {
            bw.write(String.valueOf(secondOption - firstOption));
        }
        else {
            bw.write(String.valueOf(firstOption - secondOption));
        }

        bw.flush();
        bw.close();
    }
}