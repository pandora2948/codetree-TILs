import java.util.Scanner;

public class Main {
    public static void printStrings(int n) {
        for (int i = 0; i < n; i += 1) {
            System.out.println("12345^&*()_");
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printStrings(n);
    }
}