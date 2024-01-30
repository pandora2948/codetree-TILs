import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0, y = 0;
        int cnt = 0;
        boolean isFinish = false;

        int[] dx = new int[] {0, 1, 0, -1};
        int[] dy = new int[] {-1, 0, 1, 0};

        for (int i = 0; i < n; i += 1) {
            char dChar = sc.next().charAt(0);
            int l = sc.nextInt();
            int d = 0;

            switch (dChar) {
                case 'N':
                    d = 0;
                    break;

                case 'E':
                    d = 1;
                    break;

                case 'S':
                    d = 2;
                    break;
                
                case 'W':
                    d = 3;
                    break;

                default:
                    break;
            }

            for (int j = 0; j < l; j += 1) {    
                x += dx[d];
                y += dy[d];
                cnt += 1;

                if (x == 0 && y == 0) {
                isFinish = true;
                break;
            }
            }

            if (isFinish) break;
            
        }

        System.out.println(isFinish ? cnt : -1);
        
    }
}