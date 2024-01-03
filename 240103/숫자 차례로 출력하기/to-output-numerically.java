import java.util.Scanner;

public class Main {
    public static void printNums(int n) {
        if (n == 0) return;
        
        printNums(n - 1);

        System.out.printf("%d ", n);
    }

    public static void printReverse(int n) {
        if (n == 0) return;
        
        System.out.printf("%d ", n);

        printReverse(n - 1);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printNums(n);
        System.out.println();
        printReverse(n);
    }
}