import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i += 1) {
            arr[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < n; i += 1) {
            arr[i] = sc.nextInt();
            if (i == 0) {
                System.out.printf("%d ", arr[0]);
                continue;
            }

            if (i % 2 == 0) {
                Arrays.sort(arr);
                System.out.printf("%d ", arr[i / 2]);
            }
        }
    }
}