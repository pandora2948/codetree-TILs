import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int h;
    double w;
    int round = 0;

    Person(String name, int h, double w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }

    public void info() {
        System.out.printf("%s %d %.1f\n", this.name, this.h, this.w);
        round += 1;
    }

    @Override
    public int compareTo(Person p) {
        if (round == 0) {
            return this.name.compareTo(p.name);
        }

        return p.h - this.h;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        Person[] ps = new Person[5];

        for (int i = 0; i < 5; i += 1) {
            ps[i] = new Person(sc.next(), sc.nextInt(), sc.nextDouble());
        }


        for(int i = 0; i < 2; i += 1) {
            Arrays.sort(ps);
            System.out.println(i == 0 ? "name" : "height");
            for (int j = 0; j < 5; j += 1) {
                ps[j].info();
            }
            System.out.println();
        }



    }
}