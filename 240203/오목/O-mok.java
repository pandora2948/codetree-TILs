import java.util.*;

public class Main {
    public static void printWin(int c, int d, int i, int j) {
        System.out.println(c);
        int x = 0;
        int y = 0;

        switch (d) {
            case 1:
                x = j + 3;
                y = i + 1;
                break;

            case 2:
                x = j + 1;
                y = i + 3;
                break;

            case 3:
                x = j + 3;
                y = i + 3;
                break;
            
            case 4:
                x = j + 3;
                y = i - 1;
        }
        
        System.out.printf("%d %d", y, x);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        final int n = 19;
        int[][] tbl = new int[n][n];
        int winColor = 0;
        int winDirection = 0;

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                tbl[i][j] = sc.nextInt();
            }
        }
        
        // 가로
        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n - 4; j += 1) {
                int c = tbl[i][j];
                if (c == 0) continue;

                boolean isWin = true;
                for (int k = 0; k < 5; k += 1) {
                    isWin = isWin && tbl[i][j + k] == c;
                }
                if (isWin) {
                    printWin(c, 1, i, j);
                    return;
                }
            }
        }


        // 세로
        for (int i = 0; i < n - 4; i += 1) {
            for (int j = 0; j < n; j += 1) {
                int c = tbl[i][j];
                if (c == 0) continue;

                boolean isWin = true;
                for (int k = 0; k < 5; k += 1) {
                    isWin = isWin && tbl[i + k][j] == c;
                }
                if (isWin) {
                    printWin(c, 2, i, j);
                    return;
                }
            }
        }

        // 대각(하)
        for (int i = 0; i < n - 4; i += 1) {
            for (int j = 0; j < n - 5; j += 1) {
                int c = tbl[i][j];
                if (c == 0) continue;

                boolean isWin = true;
                for (int k = 0; k < 5; k += 1) {
                    isWin = isWin && tbl[i + k][j + k] == c;
                }
                
                if (isWin) {
                    printWin(c, 3, i, j);
                    return;
                }
            }
        }
        // 대각(상)
        for (int i = 4; i < n; i += 1) {
            for (int j = 0; j < n - 4; j += 1) {
                int c = tbl[i][j];
                if (c == 0) continue;

                boolean isWin = true;
                for (int k = 0; k < 5; k += 1) {
                    isWin = isWin && tbl[i - k][j + k] == c;
                }
                if (isWin) {
                    printWin(c, 4, i , j);
                    return;
                }
            }
        }

        if (winColor == 0) {
            System.out.println(0);
        }


    }
}