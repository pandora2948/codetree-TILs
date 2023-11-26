import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[8];
        double acc = 0;
        
        for (int i = 0; i < 8; i += 1) {
            double score = sc.nextDouble();
            scores[i] = score;
            acc += score;
        }
        System.out.printf("%.1f", acc / 8);
    }
}