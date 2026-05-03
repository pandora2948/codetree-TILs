import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static void recordPos(int[] arr, int[] time) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        char d = st.nextToken().charAt(0);
        int t = Integer.parseInt(st.nextToken());

        for (int i = 0; i < t; i += 1) {
            arr[time[0]] = arr[time[0] - 1];

            if (d == 'L') {
                arr[time[0]] -= 1;
            }
            else {
                arr[time[0]] += 1;
            }
            time[0] += 1;
        }

    }

    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()),
            m = Integer.parseInt(st.nextToken());

        final int MAX_TIME = 1000000;

        int[] arrA = new int[MAX_TIME],
                arrB = new int[MAX_TIME];

        int[][] times = new int[][]{ {1}, {1}};
        for (int i = 0; i < n + m; i += 1) {
            if (i < n) {
                recordPos(arrA, times[0]);
            }
            else {
                recordPos(arrB, times[1]);
            }
        }

        int t = MAX_TIME;

        for (int i = 1; i < times[0][0]; i += 1) {
            if (arrA[i] == arrB[i]) t = Math.min(t, i);
        }

        t = t == MAX_TIME ? -1 : t;

        bw.write(String.valueOf(t));
        bw.flush();
        bw.close();
        
    }
}