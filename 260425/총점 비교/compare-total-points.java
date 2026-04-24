import java.io.*;
import java.util.*;

class Student {
    private String name;
    private int scoreA;
    private int scoreB;
    private int scoreC;

    public Student(String s, int a, int b, int c) {
        this.name = s;
        this.scoreA = a;
        this.scoreB = b;
        this.scoreC = c;
    }

    public int getScore() {
        return this.scoreA + this.scoreB + this.scoreC;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.name).append(' ').append(this.scoreA).append(' ').append(this.scoreB).append(' ').append(this.scoreC).append('\n');

        return sb.toString();
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Student[] stds = new Student[n];

        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());

            String s = st.nextToken();
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            stds[i] = new Student(s, a, b, c);
        }

        Arrays.sort(stds, (a, b) -> a.getScore() - b.getScore());
        
        for (Student s : stds) {
            sb.append(s.toString());
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}