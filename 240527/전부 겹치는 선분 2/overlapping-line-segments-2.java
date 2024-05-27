import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i += 1) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j < 2; j += 1) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i += 1) {
            int[] position = new int[101];
            for (int j = 0; j < n; j += 1) {
                if (i == j) continue;

                for (int k = arr[j][0]; k < arr[j][1]; k += 1) {
                    position[k] += 1;
                }
            }
            
            for (int j = 0; j < 101; j += 1) {
                if (position[j] == n - 2) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}