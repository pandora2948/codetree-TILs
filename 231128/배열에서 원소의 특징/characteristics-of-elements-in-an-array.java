import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int i;

        for (i = 0; i < 10; i += 1) {
            int n = sc.nextInt();
            if (n % 3 == 0) break;
            arr[i] = n;
        }
        System.out.println(arr[i- 1]);
    }
}