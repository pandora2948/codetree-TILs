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

        int[] arr = new int[n];

        for (int i = 0; i < n; i += 1) {
            arr[i] = Integer.parseInt(st.nextToken());

            if (i % 2 == 0) {
                int[] newArr = new int[i + 1];
                for (int j = 0; j <= i; j += 1) {
                    newArr[j] = arr[j];
                }
                Arrays.sort(newArr);
                if (i == 0) {
                    sb.append(newArr[0]);
                }
                else {
                    sb.append(newArr[i / 2]);
                }
                sb.append(' ');
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }
}