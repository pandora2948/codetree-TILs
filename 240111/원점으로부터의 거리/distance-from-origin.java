import java.util.*;

class Point implements Comparable<Point> {
    int x, y, c;

    Point(int x, int y, int c) {
        this.x = x;
        this.y = y;
        this.c = c;
    }

    public int sum() {
        return Math.abs(this.x) + Math.abs(this.y);
    }

    public void info() {
        System.out.println(this.c);
    }

    @Override
    public int compareTo(Point p) {
        if (this.sum() == p.sum()) {
            return this.c - p.c;
        }


        return this.sum() - p.sum();
    }


}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] ps = new Point[n];

        for (int i = 0; i < n; i += 1) {
            ps[i] = new Point(sc.nextInt(), sc.nextInt(), i + 1);
        }

        Arrays.sort(ps);

        for (int i = 0; i < n; i += 1) {
            ps[i].info();
        }

    }
}