import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        HashMap<String, Integer> map = new HashMap<>();

        final int STUDENT_COUNT = 7;
        String[] stud = new String[] {"Bessie", "Elsie", "Daisy", "Gertie", "Annabelle", "Maggie", "Henrietta"};
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < STUDENT_COUNT; i += 1) {
            map.put(stud[i], 0);
        }

        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());
            String student = st.nextToken();
            int score = Integer.parseInt(st.nextToken());

            map.compute(student, (k, v) -> v + score);
        }

        Collection<Integer> scores = map.values();

        if (n == 1) {
            int s = scores.stream()
                    .filter(x -> x != 0)
                    .reduce(100, Math::min);

            for (int i = 0; i < STUDENT_COUNT; i += 1) {
                if (map.get(stud[i]) == s) bw.write(stud[i]);
            }
        }

        int min = scores.stream()
                .filter(x -> x != 0)
                .reduce(100, Math::min);

        int secondMin = scores.stream()
                .filter(x -> x != 0 && x != min)
                .reduce(100, Math::min);

        if (scores
                .stream()
                .filter(x -> x == secondMin)
                .toArray()
                .length == 1)
        {
            for (int i = 0; i < STUDENT_COUNT; i += 1) {
                if (map.get(stud[i]) == secondMin) {
                    bw.write(stud[i]);
                }
            }
        }
        else {
            bw.write("Tie");
        }

        bw.flush();
        bw.close();
    }
}