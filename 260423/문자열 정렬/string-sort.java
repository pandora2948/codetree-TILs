import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[] str = br.readLine().toCharArray();
        Arrays.sort(str);
        bw.write(new String(str));
        bw.flush();
        bw.close();
    }
}