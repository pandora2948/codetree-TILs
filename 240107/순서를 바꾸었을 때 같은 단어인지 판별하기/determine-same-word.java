import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char[] chr1 = sc.next().toCharArray();
        char[] chr2 = sc.next().toCharArray();
        
        Arrays.sort(chr1);
        Arrays.sort(chr2);

        System.out.println(Arrays.equals(chr1, chr2) ? "Yes" : "No");
        
    }
}