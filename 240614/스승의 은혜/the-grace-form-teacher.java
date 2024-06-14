import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int totalCost = 0;
        int cnt = 0;
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());
            
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        while (totalCost < b) {
            if (arr[cnt][0] + arr[cnt][1] > b && totalCost + (arr[cnt][0] / 2 + arr[cnt][1]) < b) {
                totalCost += arr[cnt][0] / 2 + arr[cnt][1];
                cnt += 1;
                break;
            }

            totalCost += arr[cnt][0] + arr[cnt][1];
            cnt += 1;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();

    }
}