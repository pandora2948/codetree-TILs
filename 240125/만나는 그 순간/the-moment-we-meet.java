import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int arrA[] = new int[n * 1000 + 1];
        int arrB[] = new int[n * 1000 + 1];
        int timeA = 0;
        int timeB = 0;
        arrA[0] = 0;
        arrB[0] = 0;


        for (int i = 0; i < n; i += 1) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            for (int j = 0; j < t; j += 1) {
                timeA += 1;
                if (d == 'L') {
                    arrA[timeA] = arrA[timeA - 1] - 1;
                }
                else {
                    arrA[timeA] = arrA[timeA - 1] + 1;
                }
            }
        }

        for (int i = 0; i < m; i += 1) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            for (int j = 0; j < t; j += 1) {
                timeB += 1;
                if (d == 'L') {
                    arrB[timeB] = arrB[timeB - 1] - 1;
                }
                else {
                    arrB[timeB] = arrB[timeB - 1] + 1;
                }
            }
        }

        int bound = Math.max(timeA, timeB);

        for (int i = 1; i <= bound; i += 1) {
            if (arrA[i] == arrB[i]) {
                System.out.println(i);
                break;
            }
        }

        
    }
}