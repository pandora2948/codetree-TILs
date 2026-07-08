import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n;
        Integer[] arr;

        n = Integer.parseInt(br.readLine());
        arr = new Integer[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i += 1) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        
        for (int i = 0; i < n; i += 1) {
            sb.append(String.valueOf(arr[i])).append(' ');
        }
        sb.append('\n');

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < n; i += 1) {
            sb.append(String.valueOf(arr[i])).append(' ');
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}