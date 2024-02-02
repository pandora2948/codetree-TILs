import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        int max = 0;

        for (int i = 0; i < a.length; i += 1) {
            char[] aPrime = Arrays.copyOf(a, a.length);
            aPrime[i] = aPrime[i] == '0' ? '1' : '0';
            max = Math.max(max, Integer.parseInt(String.copyValueOf(aPrime), 2));
        }

        System.out.println(max);
    }
}