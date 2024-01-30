import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pos = new int[2];
        
        for (int i = 0; i < n; i += 1) {
            char d = sc.next().charAt(0);
            int l = sc.nextInt();

            switch(d) {
                case 'N':
                    pos[1] += l;
                    break;

                case 'E':
                    pos[0] += l;
                    break;

                case 'S':
                    pos[1] -= l;
                    break;

                case 'W':
                    pos[0] -= l;
                    break;
                
                default:
                    break;
            }
        }
        System.out.printf("%d %d", pos[0], pos[1]);
    }
}