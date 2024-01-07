import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] strs = new String[n];
        for (int i = 0; i < n; i += 1) {
            strs[i] = "".concat(String.valueOf(Character.valueOf((char) ('z' + 1))));
        }
        int cnt = 0;

        for (int i = 0; i < n; i += 1) {
            String str = sc.next();
            if (t.equals(str.substring(0, t.length()))) {
                strs[cnt] = str;
                cnt += 1;
            }
        }

        Arrays.sort(strs);

        System.out.println(strs[k - 1]);
    }
}