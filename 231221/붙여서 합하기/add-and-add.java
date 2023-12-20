import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String strA = sc.next();
        String strB = sc.next();
        int sum = 0;

        sum += Integer.parseInt(strA.concat(strB));
        sum += Integer.parseInt(strB.concat(strA));
        
        System.out.println(sum);
    }
}