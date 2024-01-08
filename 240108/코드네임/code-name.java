import java.util.*;

class Agent {
    char name;
    int score;

    Agent(char name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        Agent[] agents = new Agent[5];
        int idx = 0;
        int min = 100;
        
        for (int i = 0; i < 5; i += 1) {
            char c = sc.next().charAt(0);
            int s = sc.nextInt();
            agents[i] = new Agent(c, s);

            if (min > s) {
                idx = i;
                min = s;
            }
        }
        Agent target = agents[idx];

        System.out.printf("%c %d", target.name, target.score);

    }
}