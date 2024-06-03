import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> dq = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i += 1) {
            dq.addLast(i);
        }

        while(dq.size() > 1) {
            dq.removeFirst();
            dq.addLast(dq.removeFirst());
        }

        bw.write(String.valueOf(dq.removeLast()));
        bw.flush();
        bw.close();

        
    }
}