import java.util.*;

class Person {
    String name;
    String post;
    String city;

    Person(String name, String post, String city) {
        this.name = name;
        this.post = post;
        this.city = city;
    }

    void printInfo() {
        System.out.printf("name %s\n", this.name);
        System.out.printf("addr %s\n", this.post);
        System.out.printf("city %s\n", this.city);
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] persons = new Person[n];
        String[] names = new String[n];
        int idx = 0;
        String targetName;

        for (int i = 0; i < n; i += 1) {
            String name = sc.next();
            String post = sc.next();
            String city = sc.next();

            persons[i] = new Person(name, post, city);
            names[i] = name;
        }

        Arrays.sort(names, Collections.reverseOrder());
        targetName = names[0];

        for (int i = 0; i < n; i += 1){
            if (persons[i].name == targetName) {
                idx = i;
            }
        }
        
        persons[idx].printInfo();

    }
}