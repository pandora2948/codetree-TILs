import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int [n][2];
        int[] resArr = new int[201];
        int res = 0;
        int offset = 0;
        int border = 200;

        for (int i = 0; i < n; i += 1) {
            Integer x1 = sc.nextInt();
            Integer x2 = sc.nextInt();
            
            offset = Math.min(offset, Math.min(x1, x2));
            border = Math.max(border, Math.max(x1, x2));
            
            arr[i][0] = x1;
            arr[i][1] = x2;
        }
        offset = Math.abs(offset);

        for (int i = 0; i < n; i += 1) {
            arr[i][0] += offset;
            arr[i][1] += offset;
        }

        for (int i = 0; i < n; i += 1) {
            int start = arr[i][0];
            int end = arr[i][1];
            for (int j = start; j < end; j += 1) {
                resArr[j] += 1;
            }
        }

        for (int i = 0; i <= border; i += 1) {
            res = Math.max(res, resArr[i]);
        }
        
        System.out.println(res);
    }
}