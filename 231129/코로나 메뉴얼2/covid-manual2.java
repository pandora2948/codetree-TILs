import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        for (int i = 0; i < 3; i += 1) {
            char isPositive = sc.next().charAt(0);
            int temp = sc.nextInt();

            if (isPositive == 'Y') {
                if (temp >= 37) {
                    arr[0] += 1;
                }
                else {
                    arr [2] += 1;
                }
            }
            else {
                if (temp >= 37) {
                    arr[1] += 1;
                }
                else {
                    arr[3] += 1;
                }
            }
        }

        for (int i = 0; i < 4; i += 1) {
            System.out.printf("%d ", arr[i]);
        }
        if (arr[0] >= 2) {
            System.out.print("E");
        }
    }
}