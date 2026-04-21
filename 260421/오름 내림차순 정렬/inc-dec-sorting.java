import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Integer[] arr = new Intege[n];

        for (int i = 0; i < n; i += 1) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        for (int i : arr) {
            sb.append(i).append(' ');
        }
        sb.append('\n');

        Arrays.sort(arr, Collections.reverseOrder());
        for (int i : arr) {
            sb.append(i).append(' ');
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }
}