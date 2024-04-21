import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = 0;

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i += 1) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for (int i = 0 ; i < n; i += 1) {
            int[] time = new int[1001];
            int maxTime = 0;
            int workTime = 0;

            for (int j = 0; j < n; j += 1) {
                if (i == j) continue;
                int s = arr[j][0];
                int e = arr[j][1];
                maxTime = Math.max(maxTime, e);
                for (int k = s; k < e; k += 1) {
                    time[k] = 1;
                }
            }

            for (int j = 0; j < maxTime; j += 1) {
                workTime += time[j];
            }
            
            res = Math.max(res, workTime);
        }

        System.out.println(res);
    }
}