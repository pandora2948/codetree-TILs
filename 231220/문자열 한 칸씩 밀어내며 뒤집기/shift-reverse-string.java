import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();

        for (int i = 0; i < q; i += 1) {
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    str = str.substring(1).concat(str.substring(0, 1));
                    break;

                case 2:
                    str = str.substring(str.length() - 1).concat(str.substring(0, str.length() - 1));
                    break;

                case 3:
                    StringBuilder strBuild = new StringBuilder();
                    str = strBuild.append(str).reverse().toString();
                    break;

                default:
                    break;
            }
            System.out.println(str);
        }
    }
}