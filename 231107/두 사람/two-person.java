import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int firstAge, secondAge;
        char firstGender, secondGender;

        firstAge = sc.nextInt();
        firstGender = sc.next().charAt(0);
        secondAge = sc.nextInt();
        secondGender = sc.next().charAt(0);

        System.out.println(firstAge >= 19 && firstGender == 'M' || secondAge >= 19 && secondGender == 'M' ? "1" : "0");

    }
}