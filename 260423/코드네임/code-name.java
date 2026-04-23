import java.io.*;
import java.util.*;

class Person implements Comparable<Person> {
    private char code;
    private int score;

    Person(char c, int s) {
        this.code = c;
        this.score = s;
    }

    public String toString() {
        return String.format("%c %d", this.code, this.score);
    }

    public int getScore() {
        return this.score;
    }

    public int compareTo(Person o) {
        return this.getScore() - o.getScore();
    }
   
}

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        final int N = 5;

        Person[] people = new Person[N];
        for (int i = 0; i < N; i += 1) {
            st = new StringTokenizer(br.readLine());
            char code = st.nextToken().charAt(0);
            int score = Integer.parseInt(st.nextToken());

            people[i] = new Person(code, score);
        }

        Arrays.sort(people);
        bw.write(people[0].toString());
        bw.flush();
        bw.close();
    }
}