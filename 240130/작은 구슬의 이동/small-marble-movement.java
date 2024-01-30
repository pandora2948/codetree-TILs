import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int r = sc.nextInt(), c = sc.nextInt();
        char dChar = sc.next().charAt(0);
        int d = 0;
        int[] dx = new int[] {0, 1, 0, -1};
        int[] dy = new int[] {-1, 0, 1, 0};

        switch(dChar) {
            case 'U':
                d = 0;
                break;

            case 'R':
                d = 1;
                break;
            
            case 'D':
                d = 2;
                break;
            
            case 'L':
                d = 3;
                break;
            
            default:
                break;
        }

        for (int i = 0; i < t; i += 1) {
            int ny = r + dy[d];
            int nx = c + dx[d];

            if (0 < nx && nx <= n && 0 < ny && ny <= n) {
                r = ny;
                c = nx;
            }
            else {
                d = (d + 2) % 4;
            }
        }
        System.out.printf("%d %d", r, c);
    }
}