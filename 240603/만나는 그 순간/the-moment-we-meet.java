import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int MAX_DISTANCE = 1000001;
        int[] arrA = new int[MAX_DISTANCE];
        int[] arrB = new int[MAX_DISTANCE];

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int timeA = 1;
        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());
            char d = st.nextToken().charAt(0);
            int t = Integer.parseInt(st.nextToken());

            for (int j = 0; j < t; j += 1) {
                if (d == 'R') {
                    arrA[timeA] = arrA[timeA - 1] + 1;
                }
                else {
                    arrA[timeA] = arrA[timeA - 1] - 1;
                }
                timeA += 1;
            }
        }

        int timeB = 1;
        for (int i = 0; i < m; i += 1) {
            st = new StringTokenizer(br.readLine());
            char d = st.nextToken().charAt(0);
            int t = Integer.parseInt(st.nextToken());

            for (int j = 0; j < t; j += 1) {
                if (d == 'R') {
                    arrB[timeB] = arrB[timeB - 1] + 1;
                }
                else {
                    arrB[timeB] = arrB[timeB - 1] - 1;
                }
                timeB += 1;
            }
        }

        int res = -1;

        for (int i = 1; i < timeA; i += 1) {
            if (arrA[i] == arrB[i]) {
                res = i;
                break;
            }
        }
        bw.write(String.valueOf(res));
        bw.flush();
        bw.close();
    }
}