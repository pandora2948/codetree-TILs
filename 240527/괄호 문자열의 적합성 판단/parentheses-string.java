import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        char[] val = br.readLine().toCharArray();

        for (int i = 0; i < val.length; i += 1) {
            if (val[i] == '(') {
                stack.push('(');
            }
            else {
                if (stack.empty()) {
                    System.out.println("No");
                    System.exit(0);
                }
               
                stack.pop();
            }
        }
        
        
        System.out.println(stack.empty() ? "Yes" : "No");

    }
}