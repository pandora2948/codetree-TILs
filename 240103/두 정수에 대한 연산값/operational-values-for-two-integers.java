import java.util.Scanner;

public class Main {
    public static void magicCal(int[] arr) {
        int a = arr[0];
        int b = arr[1];

        if (a > b) {
            arr[0] += 25;
            arr[1] *= 2;
        }
        else {
            arr[0] *= 2;
            arr[1] += 25;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arg = {sc.nextInt(), sc.nextInt()};
        
        magicCal(arg);
        
        for (int i = 0; i < 2; i += 1) {
            System.out.printf("%d ", arg[i]);
        }
    }
}