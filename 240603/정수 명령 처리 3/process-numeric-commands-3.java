import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> dq = new ArrayDeque<>();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());
            String q = st.nextToken();
            int v = 0;
            if(st.hasMoreTokens()) {
                v = Integer.parseInt(st.nextToken());
            }
            
            switch(q) {
                case "push_front":
                    dq.addFirst(v);
                    break;
                
                case "push_back":
                    dq.addLast(v);
                    break;
                
                case "pop_front":
                    bw.write(String.valueOf(dq.removeFirst()));
                    bw.newLine();
                    break;
                
                case "pop_back":
                    bw.write(String.valueOf(dq.removeLast()));
                    bw.newLine();
                    break;
                
                case "size":
                    bw.write(String.valueOf(dq.size()));
                    bw.newLine();
                    break;

                case "empty":
                    bw.write(dq.isEmpty() ? "1" : "0");
                    bw.newLine();
                    break;

                case "front":;
                    bw.write(String.valueOf(dq.peekFirst()));
                    bw.newLine();
                    break;

                case "back":;
                    bw.write(String.valueOf(dq.peekLast()));
                    bw.newLine();
                    break;
            }
        }
        bw.flush();
        bw.close();

    }
}