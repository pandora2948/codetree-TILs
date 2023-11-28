import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), index = 0;
        int[] arr = new int[13];
        arr[0] = 1;
        arr[1] = n;

        for (int i = 2; i < 13; i += 1) {
            arr[i] = arr[i - 2] + arr[i - 1];
            if (arr[i - 1] >= 100) {
                index = i;
                break;
            }
        }

        for (int i = 0; i < index; i += 1) {
            System.out.printf("%d ", arr[i]);
        }
    }
}