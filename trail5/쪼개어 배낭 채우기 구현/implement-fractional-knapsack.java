import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int N = Integer.parseInt(st.nextToken());
        final int M = Integer.parseInt(st.nextToken());

        Double[][] jewerlys = new Double[N][3];

        for (int i = 0; i < N; i += 1) {
            st = new StringTokenizer(br.readLine());

            double w = Double.parseDouble(st.nextToken());
            double v = Double.parseDouble(st.nextToken());

            jewerlys[i][0] = v / w;
            jewerlys[i][1] = w;
            jewerlys[i][2] = v;
        }

        Arrays.sort(jewerlys, new Comparator<Double[]>() {
            public int compare(Double[] o1, Double[] o2) {
                return Double.compare(o2[0], o1[0]);
            }
        });

        double bagW = M;
        double bagV = 0;

        for (Double[] j : jewerlys) {
            double vPerW = j[0];
            double w = j[1];
            double v = j[2];

            if (bagW - w >= 0) {
                bagW -= w;
                bagV += v;
            }
            else {
                bagV += vPerW * bagW;
                break;
            }
        }

        bw.write(String.format("%.3f", bagV));
        bw.flush();
        bw.close();
    }
}