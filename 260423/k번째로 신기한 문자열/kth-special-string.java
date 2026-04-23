import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()),
            k = Integer.parseInt(st.nextToken());
        
        String t = st.nextToken();

        String[] strs = new String[n];
        int cnt = 0;

        for (int i = 0; i < n; i += 1) {
            strs[i] = br.readLine();
            boolean isMatch = true;
            for (int j = 0; j < t.length(); j += 1) {
                if (strs[i].charAt(j) != t.charAt(j)) {
                    isMatch = false;
                    break;
                }
            }
            cnt += isMatch ? 1 : 0;
        }

        String[] sorted = new String[cnt];
        cnt = 0;
        for (int i = 0; i < n; i += 1) {
            boolean isMatch = true;

            for (int j = 0; j < t.length(); j += 1) {
                if (strs[i].charAt(j) != t.charAt(j)) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                sorted[cnt] = strs[i];
                cnt += 1;
            }
        }

        Arrays.sort(sorted);
        bw.write(sorted[k - 1]);
        bw.flush();
        bw.close();
    }
}