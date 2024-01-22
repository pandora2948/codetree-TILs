import java.util.*;

public class Main {
    public static int[] arr = new int[200001];
// 위치의 타일을 색칠하는 함수
    public static void paintTile(int pos, int dir) {
        if (arr[pos] == 0) {
            arr[pos] = dir;
            return;
        }

        if (arr[pos] == 4) {
            return;
        }

        //  해당 타일의 색과 색칠 횟수를 각 -1, 2, -3 과 같이 표현하기 위한 로직
        arr[pos] = (Math.abs(arr[pos]) + 1) * (arr[pos] / Math.abs(arr[pos]) * (-1));
        
        if (Math.abs(arr[pos]) == 4) {
            arr[pos] = 4;
            return;
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = 100000;
        int min = 200000;
        int max = 0;
        int[] res = new int[3];

        for (int i = 0; i < n; i += 1) {
            int a = sc.nextInt();
            int d = sc.next().charAt(0) == 'L' ? -1 : 1;

            for (int j = 1; j <= a; j += 1) {
                paintTile(pos, d);
                if (a > j) pos += d;
            }
            // 배열에서 탐색을 적게 하기위한 탐색 범위 지정 변수 min, max
            min = Math.min(min, pos);
            max = Math.max(max, pos);
        }

        for (int i = min; i <= max; i += 1) {
            // 각 2번이상 색칠되어져 회색 : 요소의 절대값이 4 이상
            if (arr[i] == 4) {
                res[2] += 1;
                continue;
            }
            // 요소가 음수일 경우 흰색으로 색칠되어있음
            if (arr[i] < 0) {
                res[0] += 1;
                continue;
            }
            // 4 이하의 양수일 경우 검은색
            res[1] += 1;
        }

        for (int i = 0; i < 3; i += 1) {
            System.out.printf("%d ", res[i]);
        }
    }
}