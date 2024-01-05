import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chrs = str.toCharArray();
        Arrays.sort(chrs);

        for (int i = 0; i < chrs.length; i += 1) {
            System.out.print(chrs[i]);
        }
        
    }
}