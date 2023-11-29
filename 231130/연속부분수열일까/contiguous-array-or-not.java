import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        int j = 0;
        int[] arrA = new int[n1], arrB = new int[n2];

        for (int i = 0; i < n1; i += 1) {
            arrA[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i += 1) {
            arrB[i] = sc.nextInt();
        }

        for (int i = 0; i < n1; i += 1) {
            for (j = 0; j < n2;) {
                if (arrA[i + j] != arrB[j]) break;
                j += 1;
            }

            if (j == n2) {
                break;
            }
        }
        
        System.out.print(j == n2 ? "Yes" : "No");
    }
}