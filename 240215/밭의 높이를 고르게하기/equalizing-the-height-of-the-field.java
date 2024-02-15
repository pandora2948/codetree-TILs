import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();
        int res = 0;
        int cnt = 0;

        int[] pos = new int[n];

        for (int i = 0; i < n; i += 1) {
            pos[i] = Math.abs(sc.nextInt() - h);
            if (pos[i] == 0) {
                cnt += 1;
            }
        }
        
        Arrays.sort(pos);
        
        while (cnt < t) {
            for (int i = 0; i < n; i += 1) {
                if (pos[i] != 0) {
                    res += pos[i];
                    pos[i] -= pos[i];
                    cnt = i + 1;
                    break;
                }
            }
        }

        System.out.println(res);
    }
}