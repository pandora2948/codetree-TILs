import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int classroom = 0, floor = 0, bathroom = 0;

        for (int i = 1; i <= n; i += 1) {
            if (i % 12 == 0) {
                bathroom += 1;
            }
            else if (i % 3 == 0) {
                floor += 1;
            }
            else if (i % 2 == 0) {
                classroom += 1;
            }
        }
        System.out.printf("%d %d %d", classroom, floor, bathroom);
    }
}