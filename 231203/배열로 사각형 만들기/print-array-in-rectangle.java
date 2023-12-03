public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int[][] arr = new int[5][5];

        for (int i = 0; i < 5; i += 1) {
            arr[0][i] = 1;
        }

        for (int i = 1; i < 5; i += 1) {
            for (int j = 0; j < 5; j += 1) {
                if (j == 0) {
                    arr[i][j] = 1;
                    continue;
                }
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }

        for (int i = 0; i < 5; i += 1) {
            for (int j = 0; j < 5; j += 1) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

    }
}