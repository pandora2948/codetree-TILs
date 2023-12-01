import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), cnt = 1;
        int[][] arr = new int[n][m];

        for (int startCol = 0; startCol < m; startCol += 1) {
            int curRow = 0;
            int curCol = startCol;

            while (curRow < n && curCol >= 0) {
                arr[curRow][curCol] = cnt;
                curRow += 1;
                curCol -= 1;
                cnt += 1;
            }
        }

        for (int startRow = 1; startRow < n; startRow += 1) {
            int curCol = m - 1;
            int curRow = startRow;

            while (curRow < n && curCol >= 0) {
                arr[curRow][curCol] = cnt;

                curRow += 1;
                curCol -= 1;
                cnt += 1;
            }
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < m; j += 1) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}