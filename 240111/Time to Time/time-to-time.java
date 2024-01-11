import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), m = sc.nextInt(), th = sc.nextInt(), tm = sc.nextInt();
        int answer = 0;
        
        while (h != th || m != tm) {
            answer += 1;
            m += 1;

            if (m == 60) {
                h += 1;
                m = 0;
            }
        }

        System.out.println(answer);
    }
}