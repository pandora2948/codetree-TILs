import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int gender, age;
        gender = sc.nextInt();
        age = sc.nextInt();

        if (gender == 0) System.out.println(age >= 19 ? "MAN" : "BOY");
        else System.out.println(age >= 19 ? "GIRL" : "WOMAN");
    }
}