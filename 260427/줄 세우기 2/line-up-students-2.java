import java.io.*;
import java.util.*;

class Student implements Comparable<Student>{
    private int height;
    private int weight;
    private int num;

    public Student(int h, int w, int n) {
        this.height = h;
        this.weight = w;
        this.num = n + 1;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public int compareTo(Student o) {
        int tarH = o.getHeight();

        if (this.height == tarH) {
            return o.getWeight() - this.weight;
        }

        return this.height - tarH;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.height).append(' ').append(this.weight).append(' ').append(this.num).append('\n');
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Student[] std = new Student[n];

        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());

            std[i] = new Student(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), i);
        }

        Arrays.sort(std);

        for (int i = 0; i < n; i += 1) {
            sb.append(std[i].toString());
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}