import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        char[][] tbl = new char[n][m];

        for (int i = 0; i < n; i += 1) {
            tbl[i] = sc.next().toCharArray();
        }

        for (int i = 0; i < n; i += 1) {
            for (int p = 0; p < k; p += 1) {
                for (int j = 0; j < m; j += 1) {
                    for (int l = 0; l < k; l += 1) {
                        System.out.print(tbl[i][j]);
                    }
                }
                System.out.println();
            }
        }
    }
}