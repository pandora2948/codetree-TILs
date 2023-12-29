import java.util.Scanner;

public class Main {
    public static boolean checkPartition(int[] arrA, int[] arrB) {
        boolean isPartition = false;

        for (int i = 0; i < arrA.length; i += 1) {
            if (arrA[i] != arrB[0]) continue;

            for (int j = 0; j < arrB.length; j += 1) {
                try {
                    if (arrA[i + j] != arrB[j]) break;

                    if (j == arrB.length - 1) isPartition = true;

                }
                catch (Exception e) {
                    break;
                }
            }
        }
        return isPartition;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int lenA = sc.nextInt();
        int lenB = sc.nextInt();
        int[] arrA = new int[lenA];
        int[] arrB = new int[lenB];

        for (int i = 0; i < lenA; i += 1) {
            arrA[i] = sc.nextInt();
        }

        for (int i = 0; i < lenB; i += 1) {
            arrB[i] = sc.nextInt();
        }

        System.out.println(checkPartition(arrA, arrB) ? "Yes" : "No");

    }
}