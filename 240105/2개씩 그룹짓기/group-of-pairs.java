import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int partitionLength = sc.nextInt();
        int fullLength = partitionLength * 2;
        Integer[] fullArr = new Integer[fullLength];
        Integer[] arr1 = new Integer[partitionLength];
        Integer[] arr2 = new Integer[partitionLength];

        for (int i = 0; i < fullLength; i += 1) {
            fullArr[i] = sc.nextInt();
        }

        Arrays.sort(fullArr);

        for (int i = 0; i < fullLength; i += 1) {
            if (i % 2 == 0) {
                arr1[i / 2] = fullArr[i];
            }
            else {
                arr2[i / 2] = fullArr[i];
            }
        }

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < partitionLength; i += 1) {
            sum1 += arr1[i];
            sum2 += arr2[i];
        }

        System.out.println(sum1 < sum2 ? sum2 : sum1);
    }
}