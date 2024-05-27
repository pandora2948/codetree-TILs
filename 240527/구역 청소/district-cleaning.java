import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c, d;
        final int MAX_LENGTH = 101;
        int[] area = new int[MAX_LENGTH];

        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        for (int i = a; i < b; i += 1) {
            area[i] = 1;
        }

        for (int i = c; i < d; i += 1) {
            area[i] = 1;
        }

        int sum = 0;

        for (int i = 0; i < MAX_LENGTH; i += 1) {
            sum += area[i];
        }

        System.out.println(sum);
    }
}