import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] posA = new int[1000000];
        int[] posB = new int[1000000];
        int timeA = 0;
        int timeB = 0;
        int cnt = 0;

        for (int i = 0 ; i < n; i += 1) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int j = 0; j < t; j += 1) {
                timeA += 1;
                posA[timeA] = posA[timeA - 1] + v;
            }
        }
        
        for (int i = 0; i < m; i += 1) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int j = 0; j <t; j += 1) {
                timeB += 1;
                posB[timeB] = posB[timeB - 1] + v;
            }
        }
        
        for (int i = 1; i < timeA; i += 1) {
            if ((posA[i - 1] > posB[i - 1] && posA[i] <= posB[i]) 
            || (posA[i - 1] < posB[i - 1] && posA[i] >= posB[i])
            || (posA[i - 1] == posB[i - 1] && posA[i] != posB[i])) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}