import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // vertex N, edge M
        int n, m, k;

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(br.readLine()) - 1;

        ArrayList<Edge>[] edges = new ArrayList[n];
        PriorityQueue<Vertex> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i += 1) {
            edges[i] = new ArrayList<>();
        }
        
        int[] dists = new int[n];
        for (int i = 0; i < n; i += 1) {
            dists[i] = Integer.MAX_VALUE;
        }
        dists[k] = 0;

        for (int i = 0; i < m; i += 1) {
            st = new StringTokenizer(br.readLine());
            
            int s = Integer.parseInt(st.nextToken()) - 1;
            int e = Integer.parseInt(st.nextToken()) - 1;
            int w = Integer.parseInt(st.nextToken());

            edges[s].add(new Edge(s, e, w));
            edges[e].add(new Edge(e, s, w));
        }

        pq.offer(new Vertex(k, 0));

        while (!pq.isEmpty()) {
            Vertex v = pq.poll();
            int distance = v.dist;
            int vertex = v.v;

            if (distance > dists[vertex]) continue;
            
            for (Edge e : edges[vertex]) {
                int newDist = distance + e.weight;

                if (newDist < dists[e.end]) {
                    dists[e.end] = newDist;
                    pq.offer(new Vertex(e.end, newDist));
                }
            }
        }

        for (int d : dists) {
            sb.append(d == Integer.MAX_VALUE ? -1 : d).append('\n');
        }
        System.out.print(sb.toString());

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

class Vertex implements Comparable<Vertex>{
    int v;
    int dist;

    public Vertex(int v, int dist) {
        this.v = v;
        this.dist = dist;
    }

    @Override
    public int compareTo (Vertex v) {
        return Integer.compare(this.dist, v.dist);
    }
}