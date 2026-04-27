import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[3];

        for (int i = 0; i < 3; i += 1) {
            arr[i] = sc.nextInt();
        }

        int start = 60 * (11 + 24 * 11) + 11;
        int end = 60 * (arr[0] * 24 + arr[1]) + arr[2];

        System.out.println(end < start ? -1 : end - start);
    }
}