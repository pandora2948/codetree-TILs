import java.io.*;
import java.util.*;

class Pos implements Comparable<Pos>{
    private int x;
    private int y;
    private int num;

    public Pos(int x, int y, int n) {
        this.x = x;
        this.y = y;
        this.num = n;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getNum() {
        return this.num;
    }

    public int getDist() {
        return Math.abs(this.x) + Math.abs(this.y);
    }

    public int compareTo(Pos o) {
        int tarDist = o.getDist();

        if (this.getDist() == tarDist) {
            return this.num - o.getNum();
        }

        return this.getDist() - tarDist;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Pos[] pos = new Pos[n];

        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());

            pos[i] = new Pos(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), i);
        }

        Arrays.sort(pos);

        for (int i = 0; i < n; i += 1) {
            bw.write(String.valueOf(pos[i].getNum() + 1) + "\n");
        }
        bw.flush();
        bw.close();
    }
}