import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0, y = 0;

        for (int i = 0; i < n; i += 1) {
            char d = sc.next().charAt(0);
            int l = sc.nextInt();

            switch (d) {
                case 'W':
                    x -= l;
                    break;

                case 'S':
                    y -= l;
                    break;

                case 'N':
                    y += l;
                    break;

                case 'E':
                    x += l;
                    break;
            }
        }
        System.out.printf("%d %d", x, y);
    }
}