import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), p = sc.nextInt(), t = sc.nextInt();
        int[][] dev = new int[t + 1][n];
        Integer[][] arg = new Integer[t][3];

        for (int i = 0; i <= t; i += 1) {
            for (int j = 0; j < n; j += 1) {
                dev[i][j] = -1;
            }
        }
        dev[0][p - 1] = k;

        for (int i = 0; i < t; i += 1) {
            int time = sc.nextInt(), x = sc.nextInt() - 1, y = sc.nextInt() - 1;
            arg[i] = new Integer[]{time, x, y};
        }

        Arrays.sort(arg, new Comparator<Integer[]>() {
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[0] - o2[0];
            }
        });

        for (int i = 0; i < t; i += 1) {
            int x = arg[i][1];
            int y = arg[i][2];

            if (dev[i][x] > 0) {
                dev[i + 1][y] = k;
            }
            else if (dev[i][y] > 0) {
                dev[i + 1][x] = k;
            }
            
            for (int j = 0; j < n; j += 1) {
                if (dev[i][j] > 0) {
                    dev[i + 1][j] = dev[i][j] - 1;
                }
            }
        }

        for (int i = 0; i < n; i += 1) {
            System.out.print(dev[t - 1][i] == -1 ? 0 : 1);
        }

    }
}