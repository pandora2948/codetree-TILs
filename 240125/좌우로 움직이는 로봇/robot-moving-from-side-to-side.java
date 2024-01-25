import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;
        int[] posA = new int[1000000];
        int[] posB = new int[1000000];
        int timeA = 1;
        int timeB = 1;

        for (int i = 0; i < n; i += 1) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            
            for (int j = 0; j < t; j += 1) {
                if (d == 'L') {
                    posA[timeA] = posA[timeA - 1] - 1;
                }
                else {
                    posA[timeA] = posA[timeA - 1] + 1;
                }
                timeA += 1;
            }
        }

        for (int i = 0; i < m; i += 1) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            
            for (int j = 0; j < t; j += 1) {
                if (d == 'L') {
                    posB[timeB] = posB[timeB - 1] - 1;
                }
                else {
                    posB[timeB] = posB[timeB - 1] + 1;
                }
                timeB += 1;
            }
        }

        int bound = Math.max(timeA, timeB);
        int idxA = 0;
        int idxB = 0;


        for (int i = 1; i <= bound; i += 1) {
            idxA += 1;
            idxB += 1;
            if (i > timeA) {
                if (posA[timeA] != posB[idxB - 1] && posA[timeA] == posB[idxB]) {
                    cnt += 1;
                }
            }
            else if (i > timeB) {
                if (posA[idxA - 1] != posB[timeB] && posA[idxA] == posB[timeB]) {
                    cnt += 1;
                }
            }
            else if (posA[idxA - 1] != posB[idxB - 1] && posA[idxA] == posB[idxB]) {
                cnt += 1;
            }
        }

        System.out.println(cnt);
    }
}