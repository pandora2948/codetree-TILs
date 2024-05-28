import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i += 1) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch(st.nextToken()) {
                case "push_back":
                    list.add(Integer.parseInt(st.nextToken()));
                    break;

                case "pop_back":
                    list.remove(list.size() - 1);
                    break;

                case "size":
                    System.out.println(list.size());
                    break;
                
                case "get":
                    System.out.println(list.get(Integer.parseInt(st.nextToken()) - 1));
                    break;

            }
        }
    }
}