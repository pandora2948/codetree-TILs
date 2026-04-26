import java.io.*;
import java.util.*;

class Element implements Comparable<Element>{
    private int num;
    private int order;

    public Element(int n, int o) {
        this.num = n;
        this.order = o;
    }
    
    public int getNum() {
        return this.num;
    }

    public int getOrder() {
        return this.order;
    }

    public int compareTo(Element o) {
        int tarNum = o.getNum();

        if (this.num == tarNum) {
            return this.order - o.getOrder();
        }

        return this.num - tarNum;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine().trim());
        Element[] el = new Element[n];
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i += 1) {
            int a = Integer.parseInt(st.nextToken());
            el[i] = new Element(a, i);
        }

        Arrays.sort(el);

        for (int i = 0; i < n; i += 1) {
            arr[el[i].getOrder()] = i + 1;
        }

        for (int i = 0; i < n; i += 1) {
            sb.append(arr[i]).append(' ');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}