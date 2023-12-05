import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        int cnt = 0, len = 0;

        for (int i = 0; i < n; i += 1) {
            String str = sc.next();
            strs[i] = str;
        }

        for (int i = 0; i < n; i += 1) {
            len += strs[i].length();
            for (int j = 0; j < strs[i].length(); j += 1) {
                if (strs[i].charAt(j) == 'a') {
                    cnt += 1;
                }
            }
        }
        
        System.out.println(len + " " + cnt);
    }
}