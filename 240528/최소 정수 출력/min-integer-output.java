import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i += 1) {
            int q = Integer.parseInt(br.readLine());

            if (q == 0) {
                if (pq.isEmpty()) {
                    System.out.println(0);
                    continue;
                }

                System.out.println(pq.poll());
                continue;
            }

            pq.add(q);

        }

    }
}