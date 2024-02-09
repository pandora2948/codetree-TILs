import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();
        final int MAX_HEIGHT = 201;
        int[] pos = new int[MAX_HEIGHT];
        int cnt = 0;
        int cost = 0;

        for (int i = 0; i < n; i += 1) {
            int a = sc.nextInt();
            pos[a] += 1;
        }
        
        while (cnt < t) {
            int idx = 0;
            int min = MAX_HEIGHT;
            for (int i = 0; i < MAX_HEIGHT; i += 1) {
                if (pos[i] == 0 || i == h) continue;

                if (min > Math.abs(h - i)) {
                    idx = i;
                    min = Math.abs(h - i);
                }
            }

            pos[idx] -= 1;
            pos[h] += 1;
            cost += min;
            cnt = pos[h];
        }

        System.out.println(cost);
    }
}