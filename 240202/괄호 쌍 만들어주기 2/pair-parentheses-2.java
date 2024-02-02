import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int cnt = 0;
        int n = arr.length;

        for (int i = 0; i < n - 3; i += 1) {
            for (int j = i + 1; j < n - 1; j += 1) {
                if (arr[i] == '(' && arr[i] == arr[i + 1] && arr[j] == ')' && arr[j] == arr[j + 1]) {
                    cnt += 1;
                }
            }
        }

        System.out.println(cnt);
    }
}