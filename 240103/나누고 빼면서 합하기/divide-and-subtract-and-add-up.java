import java.util.Scanner;

public class Main {
    static int sum = 0;
    static int[] arr;

    public static void calculation(int m) {
        if (m == 0) return;
        sum += arr[m - 1];

        if (m % 2 == 0) {
            calculation(m / 2);
        }
        else {
            calculation(m - 1);
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i += 1) {
            arr[i] = sc.nextInt();
        }

        calculation(m);

        System.out.println(sum);
        
    }
}