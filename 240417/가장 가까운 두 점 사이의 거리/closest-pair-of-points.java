import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int[] min = new int[2];

        for (int i = 0; i < 2; i += 1) {
            min[i] = 10000;
        }

        for (int i = 0; i < n; i += 1) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                if (i == j) continue;

                int x1 = arr[i][0];
                int y1 = arr[i][1];

                int x2 = arr[j][0];
                int y2 = arr[j][1];

                int w = Math.abs(x1 - x2);
                int h = Math.abs(y1 - y2);

                if (Math.pow(w, 2) + Math.pow(h, 2) < Math.pow(min[0], 2) + Math.pow(min[1], 2)) {
                    min[0] = w;
                    min[1] = h;
                }
            }
        }
        System.out.println((int) (Math.pow(min[0] , 2) + Math.pow(min[1], 2)));

    }
}