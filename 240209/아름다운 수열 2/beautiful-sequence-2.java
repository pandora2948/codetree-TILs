import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[m];
        int[] arrTmp = new int[m];
        int cnt = 0;

        for (int i = 0; i < n; i += 1) {
            arrA[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i += 1) {
            arrB[i] = sc.nextInt();
        }
        
        Arrays.sort(arrB);

        for (int i = 0; i <= n - m; i += 1) {
            for (int j = 0; j < m; j += 1) {
                arrTmp[j] = arrA[i + j];
            }
            Arrays.sort(arrTmp);
            
            boolean isEqual = true;
            for (int j = 0; j < m; j += 1) {
                if (arrTmp[j] != arrB[j]) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                cnt += 1;
            }
        }

        System.out.println(cnt);
    }
}