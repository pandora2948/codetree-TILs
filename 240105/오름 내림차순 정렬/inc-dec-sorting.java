import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i += 1 ) {
            arr[i] = sc.nextInt();
        }

        Integer[] integerArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(integerArr);
        
        for (int i = 0; i < n; i += 1) {
            System.out.printf("%d ", integerArr[i]);
        }
        System.out.println();
        Arrays.sort(integerArr, Collections.reverseOrder());

        for (int i = 0; i < n; i += 1) {
            System.out.printf("%d ", integerArr[i]);
        }

    }
}