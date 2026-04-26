import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int a = sc.nextInt(),
            b = sc.nextInt(),
            c = sc.nextInt(),
            d = sc.nextInt();

        int diff = days[a] - b + d + 1;

        for (int i = a; i < c - 1; i += 1) {
            diff += days[i];
        }
        
        System.out.println(diff);
    }
}