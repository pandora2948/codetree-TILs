import java.util.*;

class Secret {
    String code;
    char location;
    int time;
    Secret(String code, char location, int time) {
        this.code = code;
        this.location = location;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        Secret s = new Secret(sc.next(), sc.next().charAt(0), sc.nextInt());

        System.out.printf("secret code : %s\n", s.code);
        System.out.printf("meeting point : %c\n", s.location);
        System.out.printf("time : %d\n", s.time);

    }
}