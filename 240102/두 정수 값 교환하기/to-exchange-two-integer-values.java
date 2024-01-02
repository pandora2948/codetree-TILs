import java.util.Scanner;
class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    public static void swapper(IntWrapper a, IntWrapper b) {
        int tmp = a.value;
        a.value = b.value;
        b.value = tmp;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        IntWrapper nWrapper = new IntWrapper(n);
        IntWrapper mWrapper = new IntWrapper(m);

        swapper(nWrapper, mWrapper);
        System.out.printf("%d %d", nWrapper.value, mWrapper.value);
        
    }
}