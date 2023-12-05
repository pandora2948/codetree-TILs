import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] strs = new String[10];
        int cnt = 0;

        for (int i = 0; i < 10; i += 1) {
            strs[i] = sc.next();
        }

        char alph = sc.next().charAt(0);

        for (int i = 0; i < 10; i += 1) {
            if (strs[i].charAt(strs[i].length() - 1) == alph) {
                System.out.println(strs[i]);
                cnt += 1;
            }
        }

        if (cnt == 0) {
            System.out.println("None");
        }

    }
}