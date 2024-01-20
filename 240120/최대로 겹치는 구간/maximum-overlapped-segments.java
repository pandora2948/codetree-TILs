import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int [n][2];
        Integer[] flatArr = new Integer[n * 2];
        int[] resArr = new int[200];
        int res = 0;

        for (int i = 0; i < n; i += 1) {
            Integer x1 = sc.nextInt();
            Integer x2 = sc.nextInt();
            
            arr[i][0] = x1;
            arr[i][1] = x2;
            flatArr[i] = x1;
            flatArr[n * 2 - 1 - i] = x2;
        }
        
        Arrays.sort(flatArr);
        int offset = Math.abs(flatArr[0]);

        for (int i = 0; i < n; i += 1) {
            arr[i][0] += offset;
            arr[i][1] += offset;
        }


        for (int i = 0; i < n; i += 1) {
            int start = arr[i][0];
            int end = arr[i][1] - 1;
            for (int j = start; j < end; j += 1) {
                resArr[j] += 1;
            }
        }

        int max = flatArr[flatArr.length - 1] + offset;
        for (int i = 0; i < max; i += 1) {
            res = Math.max(res, resArr[i]);
        }
        
        System.out.println(res);
    }
}