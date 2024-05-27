import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10001];

        int n = Integer.parseInt(br.readLine());
        int idx = 0;
        
        for (int i = 0; i < n; i += 1) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch(st.nextToken()) {
                case "push":
                    arr[idx] = Integer.parseInt(st.nextToken());
                    idx += 1;
                    break;

                case "pop":
                    idx -= 1;
                    System.out.println(arr[idx]);
                    arr[idx] = 0;
                    break;

                case "size":
                    System.out.println(idx);
                    break;

                case "empty":
                    System.out.println(idx == 0 ? "1" : "0");
                    break;

                case "top":
                    System.out.println(arr[idx]);
                    break;
            }
        }
        
        
    }
}