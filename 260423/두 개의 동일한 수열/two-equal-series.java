import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[2][n];

        for (int i = 0; i < 2; i += 1) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j += 1) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Arrays.sort(arr[0]);
        Arrays.sort(arr[1]);

        boolean isSame = true;
        for (int i = 0; i < n; i += 1) {
            if (arr[0][i] != arr[1][i]) {
                isSame = false;
                break;
            }
        }

        bw.write(isSame ? "Yes" : "No");
        bw.flush();
        bw.close();
    }
}