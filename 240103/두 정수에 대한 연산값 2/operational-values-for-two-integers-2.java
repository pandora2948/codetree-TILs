import java.util.Scanner;

class IntWrapper{
    int value;

    IntWrapper(int val) {
        this.value = val;
    }
}

public class Main {
    public static void magicCal(IntWrapper a, IntWrapper b) {
        if (a.value > b.value) {
            a.value *= 2;
            b.value += 10;
        }
        else {
            a.value += 10;
            b.value *= 2;
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        IntWrapper a = new IntWrapper(sc.nextInt());
        IntWrapper b = new IntWrapper(sc.nextInt());

        magicCal(a, b);
        System.out.printf("%d %d", a.value, b.value);
    }
}