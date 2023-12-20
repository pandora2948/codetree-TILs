import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int c = sc.next().charAt(0);

        c = c + 1 > 122 ? 97 : c + 1;
        System.out.println((char) c);
        
    }
}