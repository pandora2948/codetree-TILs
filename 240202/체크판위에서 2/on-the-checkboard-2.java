import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int cnt = 0;
        char[][] tbl = new char[r][c];
        for (int i = 0; i < r; i += 1) {
            for (int j = 0; j < c; j += 1) {
                tbl[i][j] = sc.next().charAt(0);
            }
        }

        for (int i = 1; i < r - 1; i += 1) {
            for (int j = 1; j < c - 1; j += 1) {
                for (int k = i + 1; k < r - 1; k += 1) {
                    for (int l = j + 1; l < c - 1; l += 1) {
                        if (tbl[i][j] != tbl[0][0] && tbl[k][l] == tbl[0][0]) {
                            cnt += 1;
                        }
                    }
                }
            }
        }
        System.out.println(tbl[0][0] == tbl[r - 1][c - 1] ? 0 : cnt);
    }
}