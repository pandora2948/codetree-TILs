import java.util.Scanner;

public class Main {
    public static void magicMethod(int[] arr) {
        for (int i = 0; i < arr.length; i += 1) {
            if (arr[i] % 2 == 0) {
                arr[i] /= 2;
            }
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i += 1) {
            arr[i] = sc.nextInt();
        }

        magicMethod(arr);

        for (int i = 0; i < n; i += 1) {
            System.out.printf("%d ", arr[i]);
        }
        
    }
}