import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;

        for (int i = 0; i < n; i += 1) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                if (i == j) continue;

                minX = Math.min(minX, Math.abs(arr[i][0] - arr[j][0]));
                minY = Math.min(minY, Math.abs(arr[i][1] - arr[j][1]));
            }
        }

        System.out.println((int) (Math.pow(minX, 2) + Math.pow(minY, 2)));

    }
}