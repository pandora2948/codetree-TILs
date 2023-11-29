import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i += 1) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i += 1) {
            int query = sc.nextInt();

            if (query == 1) {
                System.out.println(arr[sc.nextInt() - 1]);
            }
            else if (query == 2) {
                int idx = -1;
                int arg = sc.nextInt();
                
                for (int j = 0; j < n; j += 1) {
                    if (arr[j] == arg) {
                        idx = j + 1;
                        break;
                    }
                }
                
                System.out.println(idx == -1 ? "0" : idx);
            }
            else {
                int a = sc.nextInt(), b = sc.nextInt();

                for (int j = a - 1; j < b; j += 1) {
                    System.out.printf("%d ", arr[j]);
                } 
                System.out.println();
            }
        }
    }
}