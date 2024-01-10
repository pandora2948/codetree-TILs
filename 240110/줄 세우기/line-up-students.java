import java.util.*;

class Student implements Comparable<Student> {
    int h;
    int w;
    int n;

    Student(int h, int w, int n) {
        this.h = h;
        this.w = w;
        this.n = n;
    }

    public void info() {
        System.out.printf("%d %d %d\n", this.h, this.w, this.n);
    }

    @Override
    public int compareTo(Student s) {
        if (this.h != s.h) {
            return s.h - this.h;
        }

        if (this.w != s.w) {
            return s.w - this.w;
        }

        return s.n - this.n;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] stds = new Student[n];

        for (int i = 0; i < n; i += 1) {
            stds[i] = new Student(sc.nextInt(), sc.nextInt(), i + 1);
        }

        Arrays.sort(stds);

        for (int i = 0; i < n; i += 1) {
            stds[i].info();
        }
    }
}