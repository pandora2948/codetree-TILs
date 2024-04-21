import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        int cnt = 0;

        for (int i = 0; i < n ; i += 1) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }


        for (int i = 0; i < n; i += 1) {
            int[] currBound = new int[] {arr[i][0], arr[i][1]};
            boolean isCollision = false;

            for (int j = 0; j < n; j += 1) {
                if (i == j) continue;

                int[] tarBound = new int[] {arr[j][0], arr[j][1]};

                if (currBound[0] >= tarBound[0] && currBound[1] <= tarBound[1]) {
                    isCollision = true;
                    break;
                }

                if (currBound[0] <= tarBound[0] && currBound[1] >= tarBound[1]) {
                    isCollision = true;
                    break;
                }
            }
            if (!isCollision) {
                cnt += 1;
            }
        }

        System.out.println(cnt);

    }
}