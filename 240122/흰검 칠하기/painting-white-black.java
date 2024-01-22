import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static int[] arr = new int[200001];
    public static void paintTiles(int pos, int d) {
        if (Math.abs(arr[pos]) == 4) return;

        if (arr[pos] == 0) {
            arr[pos] = d;
            return;
        }

        arr[pos] = (Math.abs(arr[pos]) + 1) * (arr[pos] / Math.abs(arr[pos])) * (-1);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = 100000;
        int min = 200000;
        int max = 0;
        int[] res = new int[3];
        for (int i = 0; i < n; i += 1) {
            int a = sc.nextInt();
            int d = sc.next().charAt(0) == 'L' ? -1 : 1;


            while (a > 1) {
                paintTiles(pos, d);
                pos += d;
                a -= 1;
            }

            paintTiles(pos, d);


            min = Math.min(min, pos);
            max = Math.max(max, pos);
        }

        for (int i = min; i <= max; i += 1) {
            if (arr[i] == 0) continue;

            if (Math.abs(arr[i]) == 4) {
                res[2] += 1;
                continue;
            }

            if (arr[i] < 0) {
                res[0] += 1;
                continue;
            }
            res[1] += 1;

        }

        for (int i = 0; i < 3; i += 1) {
            System.out.printf("%d ", res[i]);
        }
    }
}