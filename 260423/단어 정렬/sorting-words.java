import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        
        String[] strs = new String[n];
        for (int i = 0; i < n; i += 1) {
            strs[i] = br.readLine();
        }

        Arrays.sort(strs);
        
        for (String s : strs) {
            sb.append(s).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}