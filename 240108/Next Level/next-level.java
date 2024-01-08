import java.util.*;

class Person {
    String id;
    int level;

    Person() {
        this.id = "codetree";
        this.level = 10;
    }

    Person(String id, int level) {
        this.id = id;
        this.level = level;
    }

    void userInfo() {
        System.out.printf("user %s lv %d\n", this.id, this.level);
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        Person p1 = new Person();
        Person p2 = new Person(sc.next(), sc.nextInt());

        p1.userInfo();
        p2.userInfo();
    }
}