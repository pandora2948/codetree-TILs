import java.io.*;
import java.util.*;

class Person{
    private String name;
    private int height;
    private float weight;

    public Person (String n, int h, float w) {
        this.name = n;
        this.height = h;
        this.weight = w;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(' ').append(this.height).append(' ').append(this.weight).append('\n');
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

        final int N = 5;
        Person[] people = new Person[N];

        for (int i = 0; i < N; i += 1) {
            st = new StringTokenizer(br.readLine());

            people[i] = new Person(st.nextToken(), Integer.parseInt(st.nextToken()), Float.parseFloat(st.nextToken()));
        }

        Arrays.sort(people, (Person a, Person b) -> a.getName().compareTo(b.getName()));

        sb.append("name\n");
        for (int i = 0; i < N; i += 1) {
            sb.append(people[i].toString());
        }

        sb.append('\n');

        Arrays.sort(people, (Person a, Person b) -> b.getHeight() - a.getHeight());
        sb.append("height\n");
        for (int i = 0; i < N; i += 1) {
            sb.append(people[i].toString());
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}