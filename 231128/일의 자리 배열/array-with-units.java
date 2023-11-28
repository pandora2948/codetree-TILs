import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        
        for (int i = 0; i < 2; i += 1){
            arr[i] = sc.nextInt();
        }

        for (int i = 2; i < 10; i += 1) {
            arr[i] = (arr[i - 2] + arr[i - 1]) % 10;
        }

        for (int i = 0; i < 10; i += 1) {
            System.out.printf("%d ", arr[i]);
        }
    }
}