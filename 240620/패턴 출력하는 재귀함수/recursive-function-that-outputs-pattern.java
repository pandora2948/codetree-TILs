import java.io.*;

public class Main {
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void printPattern(int num) throws IOException {
        if (num < 369) return;

        printPattern(num - 2);
        bw.write(String.valueOf(num) + " ");
    }

    public static void printSecondPattern(int num, int bound) throws IOException {
        if (bound > num) return;

        printSecondPattern(num - 2, bound);
        bw.write(String.valueOf(num) + " ");
    }

    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n > 369) {
            if (n % 2 == 0) printPattern(n - 1);
            else printPattern(n);
        }
        else {
            printSecondPattern(369, n);
        }

        bw.flush();
        bw.close();
    }
}