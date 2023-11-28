import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        

        for (int i = 0; i < 10; i += 1) {
            int n = sc.next().charAt(0);
            arr[i] = n;
        }

        for (int i = 0; i < 10; i += 1) {
            if (i == 1 || i == 4 || i == 7) {
                System.out.printf("%c ", arr[i]);
            }
        }
    }
}