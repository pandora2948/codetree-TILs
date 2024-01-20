import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = 1000;
        int[] arr = new int[2001];
        int res = 0;
        int min = 2001;
        int max = 0;

        for (int i = 0; i < n; i += 1) {
            int amount = sc.nextInt();
            char direction = sc.next().charAt(0);

            if (direction == 'R') {
                for (int j = pos; j < pos + amount; j += 1) {
                    arr[j] += 1;
                }
                pos += amount;
                max = Math.max(max, pos);
            }
            else {
                for (int j = pos; j > pos - amount; j -= 1) {
                    arr[j] += 1;
                }
                pos -= amount;
                min = Math.min(min, pos);
            }
        }

        for (int i = min; i <= max; i += 1) {
            if (arr[i] >= 2) {
                res += 1;
            }
        }

        System.out.println(res);
    }
}