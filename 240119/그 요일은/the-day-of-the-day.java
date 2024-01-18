import java.util.*;

public class Main {
    public static int countDates(int m, int d) {
        int[] dates = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int date = d;
        for (int i = 0; i < m - 1; i += 1) {
            date += dates[i];
        }
        return date;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(), d1 = sc.nextInt();
        int m2 = sc.nextInt(), d2 = sc.nextInt();
        String t = sc.next();

        int gap = countDates(m2, d2) - countDates(m1, d1);

        switch (t) {
            case "Tue":
                gap -= 1;
                break;

            case "Wed":
                gap -= 2;
                break;

            case "Thu":
                gap -= 3;
                break;

            case "Fri":
                gap -= 4;
                break;

            case "Sat":
                gap -= 5;
                break;

            case "Sun":
                gap -= 6;
                break;
        }

        if (gap < 0) {
            System.out.print(0);
            return;
        }

        System.out.print(gap / 7 + 1);

    }
}