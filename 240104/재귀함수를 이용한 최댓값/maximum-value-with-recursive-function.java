import java.util.Scanner;

public class Main {
    static int[] arr;
    public static int f(int n) {
        if (n == 0) return arr[0];
        
        int b = f(n - 1);

        return b < arr[n] ? arr[n] : b;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        
        for (int i = 0; i < n; i += 1) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(f(n - 1));
    }
}