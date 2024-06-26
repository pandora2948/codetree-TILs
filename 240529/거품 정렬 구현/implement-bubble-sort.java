import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i += 1) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean isDisorder = true;

        while (isDisorder) {
            isDisorder = false;
            for (int i = 0; i < n - 1; i += 1) {
                int a = arr[i];

                if (arr[i] <= arr[i + 1]) continue;

                arr[i] = arr[i + 1];
                arr[i + 1] = a;
                isDisorder = true;
            }
        }

        for (int i = 0; i < n; i += 1) {
            System.out.printf("%d ", arr[i]);
        }
    }
}