import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] distanceA = new int[1000 * n + 1];
        int[] distanceB = new int[1000 * m + 1];

        int timeA = 1;
        int timeB = 1;
        for (int i = 0; i < n; i += 1) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            
            for (int j = 0; j < t; j += 1) {
                distanceA[timeA] = distanceA[timeA - 1] + v;
                timeA += 1;
            }
        }

        for (int i = 0; i < m; i += 1) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            
            for (int j = 0; j < t; j += 1) {
                distanceB[timeB] = distanceB[timeB - 1] + v;
                timeB += 1;
            }
        }

        int cnt = -1;
        int state = 0;
        for (int i = 0; i <= timeB; i += 1) {
            if (distanceA[i] > distanceB[i] && state != -1) {
                cnt += 1;
                state = -1;
                continue;
            }

            if (distanceA[i] < distanceB[i] && state != 1) {
                cnt += 1;
                state = 1;
            }
        }

        System.out.println(cnt == -1 ? 0 : cnt);
    }
}