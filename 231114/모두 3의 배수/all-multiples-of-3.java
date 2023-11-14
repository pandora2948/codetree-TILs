import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        boolean isDrainage = true;

        for (int i = 0; i < 5; i += 1) {
            if (sc.nextInt() % 3 != 0) {
                isDrainage = false;
                break;
            }
        }
        System.out.print(isDrainage ? "1" : "0");
    }
}