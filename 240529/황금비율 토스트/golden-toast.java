import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Character> l = new LinkedList<>();
        ListIterator<Character> it;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String s = br.readLine();

        for (int i = 0; i < n; i += 1) {
            l.add(s.charAt(i));
        }

        it = l.listIterator(l.size());

        for (int i = 0; i < m; i += 1) {
            st = new StringTokenizer(br.readLine());

            char q = st.nextToken().charAt(0);
            char c;

            switch(q) {
                case 'L':
                    if (!it.hasPrevious()) continue;
                    it.previous();
                    break;

                case 'R':
                    if (!it.hasNext()) continue;
                    it.next();
                    break;

                case 'D':
                    if (!it.hasNext()) continue;
                    it.next();
                    it.remove();
                    break;

                case 'P':
                    c = st.nextToken().charAt(0);
                    it.add(c);
                    break;
            }
        }

        it = l.listIterator();

        for (int i = 0; i < l.size(); i += 1) {
            System.out.print(it.next());
        }

    }
}