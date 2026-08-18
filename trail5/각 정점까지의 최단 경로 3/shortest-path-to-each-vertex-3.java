import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Node> pq = new PriorityQueue<>();
        int n, m;

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        ArrayList<Edge>[] list = new ArrayList[n];
        for (int i = 0; i < n; i += 1) {
            list[i] = new ArrayList<>();
        }
        int[] dists = new int[n];

        for (int i = 1; i < n; i += 1) {
            dists[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < m; i += 1) {
            st = new StringTokenizer(br.readLine());
            int s, e, w;

            s = Integer.parseInt(st.nextToken()) - 1;
            e = Integer.parseInt(st.nextToken()) - 1;
            w = Integer.parseInt(st.nextToken());

            list[s].add(new Edge(s, e, w));
        }
        
        pq.offer(new Node(0, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int v = node.vertex;
            int dist = node.dist;

            if (dist > dists[v]) continue;

            for (Edge e : list[v]) {
                int newDist = dist + e.weight;

                if (newDist < dists[e.end]) {
                    dists[e.end] = newDist;

                    pq.offer(new Node(e.end, newDist));
                }

            }
        }

        for (int i = 1; i < n; i += 1) {
            sb.append(dists[i] == Integer.MAX_VALUE ? -1 : dists[i]).append('\n');
        }

        System.out.print(sb.toString());
        
    }
}

class Node implements Comparable<Node>{
    int vertex;
    int dist;

    public Node(int vertex, int dist) {
        this.vertex = vertex;
        this.dist = dist;
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.dist, o.dist);
    }
}

class Edge {
    int start;
    int end;
    int weight;

    public Edge(int start, int end, int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }
}