import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        int cnt = 0;

        for (int i = 0; i < n; i += 1) {
            for (int j = i + 1; j < n; j += 1) {
                for (int k = j + 1; k < n; k += 1) {
                    if (arr[i] == 'C' && arr[j] == 'O' && arr[k] == 'W') {
                        cnt += 1;
                    }
                }
            }
        }

        System.out.println(cnt);
        
    }
}