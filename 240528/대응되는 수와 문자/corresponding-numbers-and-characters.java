import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        HashMap<Integer,String> m1 = new HashMap<>();
        HashMap<String, Integer> m2 = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i += 1) {
            String str = br.readLine();
            m1.put(i, str);
            m2.put(str, i);
        }
        
        for (int i = 0; i < m; i += 1) {
            String str = br.readLine();

            if (m2.get(str) == null) {
                System.out.println(m1.get(Integer.parseInt(str)));
            }
            else {
                System.out.println(m2.get(str));
            }
        }
    }
}