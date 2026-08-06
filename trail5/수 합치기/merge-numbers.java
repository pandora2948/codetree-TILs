import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        PriorityQueue<Integer> pq = new PriorityQueue<>(1, (o1, o2) -> o1 - o2);

        final int N = Integer.parseInt(br.readLine());
        int cost = 0;
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i += 1) {
            pq.add(Integer.parseInt(st.nextToken()));
        }

        while (pq.size() != 1) {
            int a = pq.poll();
            int b = pq.poll();

            cost += a + b;
            pq.add(a+b);
        }

        bw.write(String.valueOf(cost));
        bw.flush();
        bw.close();
    }
}