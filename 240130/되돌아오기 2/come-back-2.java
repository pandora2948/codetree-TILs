import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char[] q = sc.next().toCharArray();
        int x = 0, y = 0;
        int d = 0;
        int cnt = 0;
        int[] dx = new int[] {0, 1, 0, -1};
        int[] dy = new int[] {-1, 0, 1, 0};

        for (int i = 0; i < q.length; i += 1) {
            cnt += 1;
            switch (q[i]) {
                case 'L':
                    d = (d + 3) % 4;
                    break;

                case 'R':
                    d = (d + 1) % 4;
                    break;
                
                case 'F':
                    x += dx[d];
                    y += dy[d];
                    break;

                default:
                    break;
            }

            if (x == 0 && y == 0) {
                break;
            }
        }

        System.out.println(x == 0 && y == 0 ? cnt : -1);
    }
}