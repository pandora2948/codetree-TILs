import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n = sc.nextInt(), cnt = 0;

        for (int i = 1; i < 100; i += 1) {
            System.out.printf("%d ", n * i);
            if (n * i % 5 == 0) cnt += 1;
            if (cnt >= 2) break;
        }
    }
}