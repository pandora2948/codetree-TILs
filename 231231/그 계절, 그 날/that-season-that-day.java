import java.util.Scanner;

public class Main {
    public static int y, m, d;

    public static boolean checkLeapYear(int y) {
        if (y % 4 != 0) return false;

        if (y % 100 == 0 && y % 400 == 0) return true;

        return y % 100 != 0;
    }

    public static boolean checkValidDate() {
        if (m > 12) return false;

        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            return d <= 31;
        }
        else if (m == 2) {
            if (checkLeapYear(y)) {
                return d <= 29;
            }
            else {
                return d <= 28;
            }
        }
        else {
            return d <= 30;
        }
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