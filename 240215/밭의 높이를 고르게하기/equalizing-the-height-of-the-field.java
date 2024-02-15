import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();
        int min = Integer.MAX_VALUE;

        int[] pos = new int[n];
        // 각 요소들을 H와의 차이로 저장
        for (int i = 0; i < n; i += 1) {
            pos[i] = Math.abs(sc.nextInt() - h);
        }
        
        for (int i = 0; i <= n - t; i += 1) {
            int sum = 0;

            for (int j = i; j < i + t; j += 1) {
                sum += pos[j];
            }

            min = Math.min(min, sum);
        }

        System.out.println(min);
    }
}