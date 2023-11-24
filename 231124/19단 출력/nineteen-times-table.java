public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        for (int i = 1; i <= 19; i += 1) {
            for (int j = 1; j <= 19; j += 1) {
                System.out.printf(j % 2 == 0 || j == 19 ? "%d * %d = %d\n" : "%d * %d = %d / ", i, j, i * j);
            }
        }
    }
}