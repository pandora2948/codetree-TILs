import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        Queue<Integer> q = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        for (int i = 1; i <= n; i += 1) {
            q.add(i);
        }

        while (!q.isEmpty()) {
            for (int i = 0; i < k - 1; i += 1) {
                q.add(q.poll());
            }
            System.out.print(q.poll() + " ");
        }
    }
}