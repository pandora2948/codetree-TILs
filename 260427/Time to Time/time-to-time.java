import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()),
            b = Integer.parseInt(st.nextToken()),
            c = Integer.parseInt(st.nextToken()),
            d = Integer.parseInt(st.nextToken());
        
        int timeA = a * 60 + b;
        int timeB = c * 60 + d;

        bw.write(String.valueOf(timeB - timeA));
        bw.flush();
        bw.close();
    }
}