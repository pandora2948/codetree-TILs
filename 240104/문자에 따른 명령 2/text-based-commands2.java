import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char[] q = sc.next().toCharArray();
        int d = 0;
        int x = 0, y = 0;

        for (int i = 0; i < q.length; i += 1) {
            char query = q[i];

            if (query == 'L') {
                if (d == 0) {
                    d = 3;
                }
                else {
                    d -= 1;
                }
                continue;
            }

            if (query == 'R') {
                d = (d + 1) % 4;
                continue;
            }
            
            switch (d) {
                case 0:
                    y += 1;
                    break;

                case 1:
                    x += 1;
                    break;

                case 2:
                    y -= 1;
                    break;

                case 3:
                    x -= 1;
                    break;
            }

        }
        System.out.printf("%d %d", x, y);
    }
}