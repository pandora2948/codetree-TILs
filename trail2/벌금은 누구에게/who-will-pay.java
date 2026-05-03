import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()),
            m = Integer.parseInt(st.nextToken()),
            k = Integer.parseInt(st.nextToken());

        int[] penalizedPerson = new int[m];
        
        for (int i = 0; i < m; i++) {
            penalizedPerson[i] = Integer.parseInt(br.readLine());
        }
        // Please write your code here.

        int[] std = new int[n];
        int target = -1;

        for (int i = 0; i < m; i += 1) {
            std[penalizedPerson[i] - 1] += 1;
            if (std[penalizedPerson[i] - 1] >= k) {
                target = penalizedPerson[i];
                break;
            }
        }

        bw.write(String.valueOf(target));
        bw.flush();
        bw.close();
    }
}