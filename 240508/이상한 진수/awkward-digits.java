import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        int res = 0;

        for (int i = 0; i < a.length(); i += 1) {
            String aPrime;
            if (a.charAt(i) == '1') {
                aPrime = a.substring(0, i).concat("0").concat(a.substring(i + 1));
            }
            else {
                aPrime = a.substring(0, i).concat("1").concat(a.substring(i + 1));
            }

            for (int j = 0; j < b.length(); j += 1) {
                String bPrime;

                for (int k = 0; k < 3; k += 1) {
                    if (b.charAt(j) == k) continue;

                    bPrime = b.substring(0, j).concat(String.valueOf(k)).concat(b.substring(j + 1));

                    if (Integer.parseInt(bPrime, 3) == Integer.parseInt(aPrime, 2)) {
                        res = Integer.parseInt(bPrime, 3);
                    }

                }
            }
        }

        System.out.println(res);

    }
}