import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] arg) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];
        int[] res = new int[27];

        for (int i = 0; i < 3; i += 1) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for (int i = 0; i < 3; i += 1) {
            for (int j = 0; j < 3; j += 1) {
                for (int k = 0; k < 3; k += 1) {
                    if (i == j && i == k) {
                        res[cnt] = arr[i];
                    }
                    else if (i == j) {
                        res[cnt] = arr[i] * arr[k];
                    }
                    else if (i == k) {
                        res[cnt] = arr[i] * arr[j];
                    }
                    else if (j == k) {
                        res[cnt] = arr[i] * arr[j];
                    }
                    else {
                        res[cnt] = arr[i] * arr[j] * arr[k];
                    }
                    cnt += 1;
                }
            }
        }

        if (Arrays.stream(res).filter(x -> x % 2 != 0).count() > 0) {
            int maxVal = Arrays.stream(res).distinct().filter(x -> x % 2 != 0).reduce(0, Math::max);
            bw.write(String.valueOf(maxVal));
        }
        else {
            int maxVal = Arrays.stream(res).distinct().filter(x-> x % 2 == 0).reduce(0, Math::max);
            bw.write(String.valueOf(maxVal));
        }

        bw.flush();
        bw.close();

    }
}