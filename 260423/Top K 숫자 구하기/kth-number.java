import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()),
            k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        
        for (int i = 0; i < n; i += 1) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        
        bw.write(String.valueOf(arr[k - 1]));
        bw.flush();
        bw.close();
    }
}