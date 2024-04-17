import java.util.Scanner;

public class Main {
    public static int calcLen(int x1, int x2, int y1, int y2) {
        return Math.abs(x2 - x1) + Math.abs(y2 - y1);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int[] min = new int[3];

        for (int i = 0; i < 3; i += 1) {
            min[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < n; i += 1) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                if (i == j) continue;

                if (calcLen(arr[i][0], arr[j][0], arr[i][1], arr[j][1]) < min[2]) {
                    min[0] = Math.abs(arr[i][0] - arr[j][0]);
                    min[1] = Math.abs(arr[i][1] - arr[j][1]);
                    min[2] = calcLen(arr[i][0], arr[j][0], arr[i][1], arr[j][1]);
                }
            }
        }

        System.out.println((int) (Math.pow(min[0], 2) + Math.pow(min[1], 2)));

    }
}