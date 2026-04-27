import java.io.*;
import java.util.*;

public class Main {
    static int countDays(int m, int d) {
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int res = d;

        for (int i = 0; i < m; i += 1) {
            res += days[i];
        }

        return res;
    }
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] dow = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int a = Integer.parseInt(st.nextToken()),
            b = Integer.parseInt(st.nextToken()),
            c = Integer.parseInt(st.nextToken()),
            d = Integer.parseInt(st.nextToken());

        int d1 = countDays(a, b),
            d2 = countDays(c, d);
        
        int diff = (d2 - d1) % 7;

        if (diff < 0) diff += 7;

        bw.write(dow[diff]);
        bw.flush();
        bw.close();
    }
}