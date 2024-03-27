import java.util.Scanner;

public class Main {
    public static int score[] = new int[6];
    
    public static int diff(int i, int j, int k) {
        int total = 0;

        for (int l = 0; l < 6; l += 1) {
            total += score[l];
        }
        
        int t1Sum = score[i] + score[j] + score[k];
        int t2Sum = total - t1Sum;

        return Math.abs(t1Sum - t2Sum);
    }
    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 6; i += 1) {
            score[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i += 1) {
            for (int j = 0; j < 6; j += 1) {
                for (int k = 0; k < 6; k += 1) {
                    if (i == j || j == k || i == k) continue;
                    
                    min = Math.min(min, diff(i, j, k));
                }
            }
        }
        
        System.out.println(min);

    }
}