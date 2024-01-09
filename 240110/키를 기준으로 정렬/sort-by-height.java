import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int height;
    int weight;

    Person (String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    void printInfo() {
        System.out.printf("%s %d %d\n", this.name, this.height, this.weight);
    }

    @Override
    public int compareTo(Person p) {
        if (this.height > p.height) {
            return 1;
        }
        else if (this.height == p.height) {
            return 0;
        }
        else {
            return -1;
        }
    }

}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] persons = new Person[n];

        for (int i = 0; i < n; i += 1) {
            persons[i] = new Person(sc.next(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(persons);

        for (int i = 0; i < n; i += 1) {
            persons[i].printInfo();
        }
    }
}