import java.util.*;

class Bomb {
    String code;
    char color;
    int second;
    
    Bomb(String code, char color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }

    void printInfo() {
        System.out.printf("code : %s\n", this.code);
        System.out.printf("color : %c\n", this.color);
        System.out.printf("second : %d\n", this.second);
    }
}


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        Bomb b1 = new Bomb(sc.next(), sc.next().charAt(0), sc.nextInt());
        b1.printInfo();

    }
}