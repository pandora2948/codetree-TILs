import java.util.Scanner;

public class Main {
    public static String str = "";

    public static int checkPartition(String target) {
        for (int i = 0; i < str.length(); i += 1) {
            if (str.charAt(i) == target.charAt(0)) {
                for (int j = 0; j < target.length(); j += 1) {
                    if (i + j >= str.length() || str.charAt(i + j) != target.charAt(j)) break;

                    if (j == target.length() - 1) return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        String target = sc.next();

        System.out.println(checkPartition(target));

    }
}