import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];

        arr[1] = 1;

        for (int i = 2; i < n + 1; i += 1) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        bw.write(String.valueOf(arr[n]));
        bw.flush();
        bw.close();
    }
}