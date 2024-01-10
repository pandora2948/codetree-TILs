import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int h, w;

    Person(String name, int h, int w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }

    public void info() {
        System.out.printf("%s %d %d\n", this.name, this.h, this.w);
    }

    @Override
    public int compareTo(Person p) {
        if (this.h != p.h) {
            return this.h - p.h;
        }

        return p.w - this.w;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] ps = new Person[n];

        for (int i = 0; i < n; i += 1) {
            ps[i] = new Person(sc.next(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(ps);

        for (int i = 0; i < n; i += 1) {
            ps[i].info();
        }
    }
}