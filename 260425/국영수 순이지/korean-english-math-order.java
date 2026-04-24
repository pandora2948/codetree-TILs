import java.io.*;
import java.util.*;

class Student implements Comparable<Student>{
    private String name;
    private int kor;
    private int eng;
    private int math;

    public Student(String name, int k, int e, int m) {
        this.name = name;
        this.kor = k;
        this.eng = e;
        this.math = m;
    }

    public int getKor() {
        return this.kor;
    }

    public int getEng() {
        return this.eng;
    }

    public int getMath() {
        return this.math;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(' ').append(this.kor).append(' ').append(this.eng).append(' ').append(this.math).append('\n');
        return sb.toString();
    }

    public int compareTo(Student o) {
        int tarKor = o.getKor();

        if (tarKor == this.getKor()) {
            int tarEng = o.getEng();

            if (tarEng == this.getEng()) {
                return o.getMath() - this.getMath();
            }

            return tarEng - this.getEng();
        }

        return tarKor - this.getKor();
    }



}

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Student[] stds = new Student[n];

        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());

            stds[i] = new Student(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
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