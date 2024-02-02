import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        int cnt = 0;

        for (int i = 0; i < c.length; i += 1) {
            for (int j = i; j < c.length; j += 1) {
                if (c[i] == '(' && c[j] == ')') {
                    cnt += 1;
                }
            }
        }

        System.out.println(cnt);


    }
}