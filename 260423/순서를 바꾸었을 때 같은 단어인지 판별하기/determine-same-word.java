import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] strs = new String[2];

        for (int i = 0; i < 2; i += 1) {
            char[] str = br.readLine().toCharArray();
            Arrays.sort(str);
            strs[i] = new String(str);
        }

        bw.write(strs[0].equals(strs[1]) ? "Yes" : "No");
        bw.flush();
        bw.close();
    }
}