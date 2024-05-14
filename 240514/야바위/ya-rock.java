import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int maxVal = 0;
        int arrA[] = new int[n];
        int arrB[] = new int[n];
        int arrC[] = new int[n];
        
        for (int i = 0; i < n; i += 1) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrA[i] = Integer.parseInt(st.nextToken());
            arrB[i] = Integer.parseInt(st.nextToken());
            arrC[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= 3; i += 1) {
            int score = 0;
            int pos = i;

            for (int j = 0; j < n; j += 1) {
                if (arrA[j] == pos) {
                    pos = arrB[j];
                }
                else if (arrB[j] == pos) {
                    pos = arrA[j];
                }

                if (pos == arrC[j]) {
                    score += 1;
                }
            }
            maxVal = Math.max(maxVal, score);
        }

        System.out.println(maxVal);

    }
}