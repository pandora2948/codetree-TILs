import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), p = sc.nextInt(), t = sc.nextInt();
        int[] dev = new int[n];
        Integer[][] arg = new Integer[t][3];

        for (int i = 0; i < n; i += 1) {
            dev[i] = -1;
        }

        dev[p - 1] = k;

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

            if (dev[x] > 0) {
                dev[x] -= 1;
                if (dev[y] > 0) {
                    dev[y] -= 1;
                }

                else if (dev[y] < 0) {
                    dev[y] = k;
                }
            }
            else if (dev[y] > 0) {
                dev[y] -= 1;
                if (dev[x] < 0) {
                    dev[x] = k;
                }
            }
        }

        for (int i = 0; i < n; i += 1) {
            System.out.print(dev[i] == -1 ? 0 : 1);
        }

    }
}