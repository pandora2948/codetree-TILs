import java.util.*;

public class Main {
    static int[] dates = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int countDateGap(int m1, int d1, int m2, int d2) {
        int firstDate = 0, secondDate = 0;
        for (int i = 0; i < m1 - 1; i += 1) {
            firstDate += dates[i];
        }
        firstDate += d1;

        for (int i = 0; i < m2 - 1; i += 1) {
            secondDate += dates[i];
        }
        secondDate += d2;

        return secondDate - firstDate;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(), d1 = sc.nextInt();
        int m2 = sc.nextInt(), d2 = sc.nextInt();
        int cnt = 1;

        String[] days = new String[] {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        int gap = countDateGap(m1, d1, m2, d2);

        if (gap < 0) {
            for (int i = gap; i < 0; i += 1) {
                cnt = cnt - 1 < 0 ? 6 : cnt -1;
            }
        }
        else if (gap > 0){
            cnt += gap % 7;
        }

        System.out.print(days[cnt]);
    }
}