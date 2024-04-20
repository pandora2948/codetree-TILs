import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] arr = new int[n][2];
        int res = 0;

        for (int i = 0; i < n; i += 1) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                for (int k = 0; k < n; k += 1) {
                    if (i == j || j == k || k == i) continue;
                    int x1 = arr[i][0], x2 = arr[j][0], x3 = arr[k][0];
                    int y1 = arr[i][1], y2 = arr[j][1], y3 = arr[k][1];

                    if (x1 != x2 && y1 == y2) {
                        if (x1 == x3 && y1 != y3) {
                            res = Math.max(res, Math.abs(x2 - x1) * Math.abs(y3 - y1));
                        }

                        else if (x2 == x3 && y2 != y3) {
                            res = Math.max(res, Math.abs(x2 - x1) * Math.abs(y3 - y2));
                        }
                    }

                    else if (x2 != x3 && y2 == y3) {
                        if (x1 == x2 && y1 != y2) {
                            res = Math.max(res, Math.abs(x3 - x2) * Math.abs(y2 - y1));
                        }

                        else if (x1 == x3 && y1 != y3) {
                            res = Math.max(res, Math.abs(x3 - x2) * Math.abs(y3 - y1));
                        }
                    }

                    else if (x1 != x3 && y1 == y3) {
                        if (x1 == x2 && y1 != y2) {
                            res = Math.max(res, Math.abs(x3 - x1) * Math.abs(y2 - y1));
                        }

                        else if (x2 == x3 && y2 != y3) {
                            res = Math.max(res, Math.abs(x3 - x1) * Math.abs(y3 - y2));
                        }
                    }


                }
            }
        }

        System.out.println(res);
    }
}