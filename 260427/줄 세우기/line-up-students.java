import java.io.*;
import java.util.*;

class Student implements Comparable<Student> {
    private int height;
    private int weight;
    private int number;

    public Student(int h, int w, int n) {
        this.height = h;
        this.weight = w;
        this.number = n;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getNumber() {
        return this.number;
    }

    public int compareTo(Student o) {
        int tarH = o.getHeight();

        if (tarH == this.height) {
            int tarW = o.getWeight();

            if (tarW == this.weight) {
                return this.number - o.getNumber();
            }
            
            return tarW - this.weight;
        }

        return tarH - this.height;
    }

    public String toString() {
        return String.format("%d %d %d\n", this.height, this.weight, this.number);
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
        Student[] stds = new Student[n];

        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());

            stds[i] = new Student(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), i + 1);
        }

        Arrays.sort(stds);

        for (int i = 0; i < n; i += 1) {
            sb.append(stds[i].toString());
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }
}