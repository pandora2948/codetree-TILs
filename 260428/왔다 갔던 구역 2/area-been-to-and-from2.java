import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int[] pos = new int[2000];
        int x = 1000;

        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            
            if (c == 'L') {
                for (int j = x - l; j < x; j += 1) {
                    pos[j] += 1;
                }
                x -= l;
            }
            else {
                for (int j = x; j < x + l; j += 1) {
                    pos[j] += 1;
                }
                x += l;
            }
        }

        int res = 0;

        for (int i = 0; i < 2000; i += 1) {
            if (pos[i] > 1) res += 1;
        }

        bw.write(String.valueOf(res));
        bw.flush();
        bw.close();
    }
}