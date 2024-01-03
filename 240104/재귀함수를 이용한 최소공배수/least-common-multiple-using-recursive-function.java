import java.util.Scanner;

public class Main {
    static int[] arr;
    static int cm;
    static int maxIdx = 0;

    public static void f(int i) {
        cm = arr[maxIdx] * i;
    }

    public static boolean g(int n) {
        if (n == 0) {
            return cm % arr[n] == 0;
        }

        return g(n - 1) && cm % arr[n] == 0;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i += 1) {
            int ele = sc.nextInt();
            arr[i] = ele;
        }

        for (int i = 1; i < n; i += 1) {
            maxIdx = arr[maxIdx] < arr[i] ? i : maxIdx;
        }

        int cnt = 1;
        cm = arr[maxIdx];
        while (!g(n - 1)) {
            f(cnt);
            cnt += 1;
        }

        System.out.println(cm);
    }
}