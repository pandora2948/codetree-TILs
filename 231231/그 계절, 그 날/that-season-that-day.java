import java.util.Scanner;

public class Main {
    public static int y, m, d;

    public static boolean checkLeapYear(int y) {
        if (y % 4 != 0) return false;

        if (y % 100 == 0 && y % 400 == 0) return true;

        return false;
    }

    public static boolean checkValidDate() {
        if (m > 12) return false;

        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (d <= 31) return true;
        }
        else if (m == 2) {
            if (checkLeapYear(y)) {
                if (d <= 29) return true;
            }
            else {
                if (d <= 28) return true;
            }
        }
        else if (m <= 12) {
            if (d <= 30) return true;
        }
        
        return false;
    }

    public static String checkSeasons() {
        if (!checkValidDate()) return "-1";

        if (m >= 3 && m <= 5) return "Spring";
        else if (m >= 6 && m <= 8) return "Summer";
        else if (m >= 9 && m <= 11) return "Fall";
        else return "Winter";
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        m = sc.nextInt();
        d = sc.nextInt();

        System.out.println(checkSeasons());
    }
}