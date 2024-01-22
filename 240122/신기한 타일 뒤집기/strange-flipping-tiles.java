import java.util.*;

public class Main {
    public static int[] arr = new int[200001];
    public static void paintTile(int pos, int d) {
        arr[pos] = d;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = 100000;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] res = new int[2];

        
        for (int i = 0; i < n; i += 1) {
            int a = sc.nextInt();
            int d = sc.next().charAt(0) == 'L' ? -1 : 1;

            while (a > 0) {
                paintTile(pos, d);
                a -= 1;
                if (a > 0) pos += d;
            }
            min = Math.min(min, pos);
            max = Math.max(max, pos);
            
        }

        for (int i = min; i <= max; i += 1) {
            if (arr[i] == 1) {
                res[1] += 1;
            }
            else {
                res[0] += 1;
            }
        }

        System.out.printf("%d %d", res[0], res[1]);
    }
}