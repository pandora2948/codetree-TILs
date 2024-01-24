import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] item = new int[2];
        int max = 0;
        
        for (int i = 0 ; i < n; i += 1) {
            int e = sc.nextInt();
            arr[i] = e;
        }

        item[0] = arr[0];
        item[1] = 1;

        for (int i = 1; i < n; i += 1) {
            if (arr[i] != arr[i - 1]) {
                item[0] = arr[i];
                item[1] = 1;
                continue;
            }
            item[1] += 1;
            max = Math.max(max, item[1]);
        }

        System.out.println(max);

    }
}