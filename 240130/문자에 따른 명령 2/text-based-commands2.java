import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] pos = new int[2];
        int d = 0;
        char[] q = sc.next().toCharArray();
        int[] dx = new int[] {0, 1, 0, -1};
        int[] dy = new int[] {1, 0, -1, 0};

        for (int i = 0; i < q.length; i += 1) {
            switch (q[i]) {
                case 'L':
                    d = (d - 1 + 4) % 4;
                    break;

                case 'R':
                    d = (d + 1) % 4;
                    break;

                case 'F':
                    pos[0] += dx[d];
                    pos[1] += dy[d];
                    break;
            }
        }

        System.out.printf("%d %d", pos[0], pos[1]);
    }
}