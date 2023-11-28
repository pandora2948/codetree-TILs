import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int index = 0, sum = 0;
        
        for (int i = 0; i < 100; i += 1) {
            int n = sc.nextInt();
            if (n == 0) {
                index = i - 1;
                break;
            }
            arr[i] = n;
        }

        for (int i = index; i > index - 3; i -= 1) {
            sum += arr[i];
        }
        System.out.print(sum);
    }
}