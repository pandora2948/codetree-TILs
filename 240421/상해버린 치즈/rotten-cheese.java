import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        // n : 총원, m : 치즈 수
        int n = sc.nextInt(), m = sc.nextInt(), d = sc.nextInt(), s = sc.nextInt();

        int[][] arrD = new int[d][3];
        int[][] arrS = new int[s][2];
        int[] contaminated = new int[m];
        int res = 0;

        for (int i = 0; i < d; i += 1) {
            // p : 몇번째 사람, m : 몇번째 치즈, t : 언제 먹었는가
            arrD[i][0] = sc.nextInt();
            arrD[i][1] = sc.nextInt();
            arrD[i][2] = sc.nextInt();
        }

        for (int i = 0; i < s; i += 1) {
            // p : 몇번째 사람, t : 언제 아팠는가
            arrS[i][0] = sc.nextInt();
            arrS[i][1] = sc.nextInt();
        }

        for (int i = 0; i < s; i += 1) {
            for (int j = 0; j < d; j += 1) {
                if (arrD[j][0] == arrS[i][0] && arrD[j][2] + 1 == arrS[i][1]) {
                    contaminated[arrD[j][1]] = 1;
                    break;
                }
            }
        }

        for (int i = 0; i < contaminated.length; i += 1) {
            int[] person = new int[n];
            int cnt = 0;
            for (int j = 0; j < d; j += 1) {
                if (contaminated[i] == arrD[j][1]) {
                    person[arrD[j][0] - 1] = 1;
                }
            }

            for (int j = 0; j < n; j += 1) {
                cnt += person[j];
            }

            res = Math.max(res, cnt);

        }


        System.out.println(res);

    }
}