import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger n = new BigInteger(br.readLine(), 2);

        bw.write(n.multiply(BigInteger.valueOf(17)).toString(2));
        bw.flush();
        bw.close();
    }
}