import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String query = sc.next();

        for (int i = 0; i < query.length(); i += 1) {
            char q = query.charAt(i);
            StringBuilder strBuild = new StringBuilder();
            if (q == 'L') {
                str = strBuild.append(str.substring(1)).append(str.substring(0, 1)).toString();
            }
            else {
                str = strBuild.append(str.substring(str.length() - 1)).append(str.substring(0, str.length() - 1)).toString();
            }
        }

        System.out.println(str);

    }
}