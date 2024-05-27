import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[4];

        for (int i = 0; i < 4; i += 1) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(arr[1] >= arr[2] ? "intersecting" : "nonintersecting");
    }
}