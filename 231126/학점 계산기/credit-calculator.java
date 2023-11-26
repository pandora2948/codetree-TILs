import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] scores = new double[n];
        double acc = 0;

        for (int i = 0; i < n; i += 1) {
            double score = sc.nextDouble();
            scores[i] = score;
            acc += score;
        }

        System.out.printf("%.1f\n", (double) acc / n);
        if (acc / n >= 4) {
            System.out.print("Perfect");
        }
        else if (acc / n >= 3) {
            System.out.print("Good");
        }
        else {
            System.out.print("Poor");
        }
    }
}