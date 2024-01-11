import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] days = new int[12];
        int res = 1;
        int m1 = sc.nextInt(), d1 = sc.nextInt();
        int m2 = sc.nextInt(), d2 = sc.nextInt();

        for(int i = 0; i < 12; i += 1) {
            if (i == 1) {
                days[i] = 28;
                continue;
            }
            
            if (i % 2 == 0) {
                if (i < 8) {
                    days[i] = 31;
                }
                else {
                    days[i] = 30;
                }
            }
            else {
                if (i < 8) {
                    days[i] = 30;
                }
                else {
                    days[i] = 31;
                }
            }
        }
        
        while (m1 != m2 || d1 != d2) {
            d1 += 1;
            res += 1;

            if (d1 > days[m1 - 1]) {
                m1 += 1;
                d1 = 1;
            }
        }

        System.out.println(res);
    }
}