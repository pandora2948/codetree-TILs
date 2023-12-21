import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int cnt = 0, oddCnt = 0;
        String[] strings = new String[100];

        while (true) {
            String str = sc.next();

            if (str.equals("0")) {
                break;
            }

            
            if (cnt % 2 == 0) {
                strings[oddCnt] = str;
                oddCnt += 1;
            }
            cnt += 1;
            
        }

        System.out.println(cnt);

        for (int i = 0; i < oddCnt; i += 1) {
            System.out.println(strings[i]);
        }
    }
}