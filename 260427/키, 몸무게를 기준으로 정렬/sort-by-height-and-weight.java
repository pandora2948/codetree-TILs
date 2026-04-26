import java.io.*;
import java.util.*;

class Person implements Comparable<Person>{
    private String name;
    private int height;
    private int weight;

    public Person(String n, int h, int w) {
        this.name = n;
        this.height = h;
        this.weight = w;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(' ').append(this.height).append(' ').append(this.weight).append('\n');
        return sb.toString();
    }

    public int compareTo(Person o) {
        int tarH = o.getHeight();

        if (tarH == this.height) {
            return o.getWeight() - this.weight;
        }

        return this.height - o.height;
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
        Person[] people = new Person[n];

        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());
            people[i] = new Person(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(people);

        for (int i = 0; i < n; i += 1) {
            sb.append(people[i].toString());
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}