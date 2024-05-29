import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> list = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i += 1) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String q = st.nextToken();

            int num;


            switch (q) {
                case "push_front":
                    num = Integer.parseInt(st.nextToken());
                    list.addFirst(num);
                    break;

                case "push_back":
                    num = Integer.parseInt(st.nextToken());
                    list.addLast(num);
                    break;

                case "pop_front":
                    System.out.println(list.pollFirst());
                    break;

                case "pop_back":
                    System.out.println(list.pollLast());
                    break;

                case "size":
                    System.out.println(list.size());
                    break;

                case "empty":
                    System.out.println(list.isEmpty() ? "1" : "0");
                    break;

                case "front":
                    System.out.println(list.peekFirst());
                    break;

                case "back":
                    System.out.println(list.peekFirst());
                    break;
            }
        }
    }
}