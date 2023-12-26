import java.util.Scanner;

public class Main {
    public static boolean checkNum(int n) {
        String strN = String.valueOf(n);
        for (int i = 0; i < strN.length(); i += 1) {
            int curNum = Integer.parseInt(String.valueOf(strN.charAt(i)));
            if (curNum % 3 == 0 && curNum != 0) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean multOfThree(int n) {
        return n % 3 == 0;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int cnt = 0;

        for (int i = a; i <= b; i += 1) {
            cnt = checkNum(i) || multOfThree(i) ? cnt + 1 : cnt;
        }
        
        System.out.println(cnt);
    }
}