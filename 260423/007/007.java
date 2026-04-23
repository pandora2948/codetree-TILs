import java.io.*;
import java.util.*;

class Crypto {
    private String code;
    private char rendevu;
    private int time;
    private StringBuilder sb = new StringBuilder();

    public Crypto (String code, char rendevu, int time) {
        this.code = code;
        this.rendevu = rendevu;
        this.time = time;
    }

    public String toString() {
        sb.append("secret code : ").append(this.code).append('\n');
        sb.append("meeting point : ").append(this.rendevu).append('\n');
        sb.append("time : ").append(this.time);
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        String code = st.nextToken();
        char pos = st.nextToken().charAt(0);
        int t = Integer.parseInt(st.nextToken());

        Crypto c = new Crypto(code, pos, t);

        bw.write(c.toString());
        bw.flush();
        bw.close();

        

    }
}