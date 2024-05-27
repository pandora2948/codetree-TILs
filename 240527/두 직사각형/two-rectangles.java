import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] rect = new int[2][4];

        for (int i = 0; i < 2; i += 1) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 4; j += 1) {
                rect[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        boolean isOverlap = true;

        if (rect[0][0] > rect[1][2] || rect[0][2] < rect[1][0]) {
            isOverlap = false;
        }
        else if (rect[0][1] > rect[1][3] || rect[0][3] < rect[1][1]) {
            isOverlap = false;
        }

        System.out.println(isOverlap ? "overlapping" : "nonoverlapping");
    }
}