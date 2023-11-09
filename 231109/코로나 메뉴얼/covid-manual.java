import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char aPos, bPos, cPos;
        int aTemp, bTemp, cTemp;
        aPos = sc.next().charAt(0);
        aTemp = sc.nextInt();
        bPos = sc.next().charAt(0);
        bTemp = sc.nextInt();
        cPos = sc.next().charAt(0);
        cTemp = sc.nextInt();

        if (aPos == 'Y' && aTemp >= 37) {
            if (bPos == 'Y' && bTemp >= 37 || cPos == 'Y' && cTemp >= 37) {
                System.out.println("E");
            }
            else {
                System.out.println("N");
            }
        }
        else {
            if ((bPos == 'Y' && bTemp >= 37) && (cPos == 'Y' && cTemp >= 37)) {
                System.out.println("E");
            }
            else {
                System.out.println("N");
            }
        }
    }
}