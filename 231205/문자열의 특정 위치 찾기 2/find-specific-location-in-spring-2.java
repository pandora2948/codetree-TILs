import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] strs = new String[]{"apple", "banana", "grape", "blueberry", "orange"};
        char alph = sc.next().charAt(0);
        int cnt = 0;

        for (int i = 0; i < 5; i += 1) {
            boolean hasAlph = false;
            for (int j = 2; j < 4; j += 1) {
                if (alph == strs[i].charAt(j)) {
                    cnt += 1;
                    hasAlph = true;
                    break;
            }
            }
            if (hasAlph) {
                System.out.println(strs[i]);
            }
        }
        System.out.println(cnt);


    }
}