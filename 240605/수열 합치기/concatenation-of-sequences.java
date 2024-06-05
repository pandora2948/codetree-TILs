import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arrA = new int[n];
        int[] arrB = new int[m];

        st= new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i += 1) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i += 1) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        int[] arrC = new int[n + m];
        int idxA = 0;
        int idxB = 0;
        int idxC = 0;
        for (int i = 0; i < m + n; i += 1) {
            if (idxA >= n) {
                arrC[idxC] = arrB[idxB];
                idxB += 1;
            }
            else if (idxB >= m) {
                arrC[idxC] = arrA[idxA];
                idxA += 1;
            }
            else if (arrB[idxB] <= arrA[idxA]) {
                arrC[idxC] = arrB[idxB];
                idxB += 1;
            }
            else if (arrB[idxB] >= arrA[idxA]) {
                arrC[idxC] = arrA[idxA];
                idxA += 1;
            }
            idxC += 1;
        }

        for (int i = 0; i < n + m; i += 1) {
            bw.write(String.valueOf(arrC[i]) + " ");
        }
        bw.flush();
        bw.close();
    }
}