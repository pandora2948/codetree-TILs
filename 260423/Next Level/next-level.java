import java.io.*;
import java.util.*;

class Player {
    private String id;
    private int lvl;
    
    public Player(String id, int lvl) {
        this.id = id;
        this.lvl = lvl;
    }

    public String getId() {
        return this.id;
    }

    public String getLevel() {
        return String.valueOf(this.lvl);
    }


}

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        String id = st.nextToken();
        int lvl = Integer.parseInt(st.nextToken());

        Player p1 = new Player("codetree", 10),
            p2 = new Player(id, lvl);

        sb.append("user ").append(p1.getId()).append(" lv ").append(p1.getLevel()).append('\n');
        sb.append("user ").append(p2.getId()).append(" lv ").append(p2.getLevel());

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}