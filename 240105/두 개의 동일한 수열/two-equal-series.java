import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isSame = true;
        Integer[] arr1 = new Integer[n];
        Integer[] arr2 = new Integer[n];
        
        for (int i = 0; i < n; i += 1) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i += 1) {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < n; i += 1) {
            if (arr1[i] != arr2[i]) {
                isSame = false;
                break;
            }
        }
        System.out.println(isSame ? "Yes" : "No");
    }
}