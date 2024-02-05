import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int MAX_POSITION = 10001;
        char[] arr = new char[MAX_POSITION];
        int res = 0;

        for (int i = 0; i < n; i += 1) {
            int e = sc.nextInt();
            arr[e - 1] = sc.next().charAt(0);
        }

        for (int i = 0; i < MAX_POSITION - k; i += 1) {
            int sum = 0;
            for (int j = 0; j <= k; j += 1) {
                char c = arr[i + j];
                switch (c) {
                    case 'G':
                        sum += 1;
                        break;
                    
                    case 'H':
                        sum += 2;
                        break;
                }
            }
            res = Math.max(res, sum);
        }
        System.out.println(res);

    }
}