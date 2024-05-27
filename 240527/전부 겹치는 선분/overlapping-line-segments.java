import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] pos = new int[101];
        int[][] arr = new int[n][2];
        int maxCount = 0;

        for (int i = 0; i < n; i += 1) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j += 1) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = arr[i][0]; j < arr[i][1]; j += 1) {
                pos[j] += 1;
            }
        }
        
        for (int i = 0; i < 101; i += 1) {
            maxCount = Math.max(maxCount, pos[i]);
        }
        
        System.out.println(maxCount == n - 1 ? "Yes" : "No");
    }
}