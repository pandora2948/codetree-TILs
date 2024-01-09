import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int s1;
    int s2;
    int s3;

    Student(String name, int s1, int s2, int s3) {
        this.name = name;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public int compareTo(Student s){
        if (this.s1 != s.s1) {
            return s.s1 - this.s1;
        }

        if (this.s2 != s.s2) {
            return s.s2 - this.s2;
        }

        return s.s3 - this.s3;
    }

    void printInfo() {
        System.out.printf("%s %d %d %d\n", this.name, this.s1, this.s2, this.s3);
    }

}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] ss = new Student[n];

        for (int i = 0; i < n; i += 1) {
            ss[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(ss);

        for (int i = 0; i < n; i += 1) {
            ss[i].printInfo();
        }
    }
}