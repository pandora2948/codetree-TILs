import java.util.*;

class Element {
    int v, c, idx;

    Element(int v, int c) {
        this.v = v;
        this.c = c;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Element[] ele = new Element[n];

        for (int i = 0; i < n; i += 1) {
            Integer num = sc.nextInt();
            ele[i] = new Element(num, i);
        }

        Arrays.sort(ele, new Comparator<Element>() {
            public int compare(Element e1, Element e2) {
                if (e1.v != e2.v) {
                    return e1.v - e2.v;
                }

                return e1.c - e2.c;
            }
        });

        for (int i = 0; i < n; i += 1) {
            ele[i].setIdx(i + 1);
        }

        Arrays.sort(ele, new Comparator<Element>() {
            public int compare(Element e1, Element e2) {
                return e1.c - e2.c;
            }
        });

        for (int i = 0; i < n; i += 1) {
            System.out.printf("%d ", ele[i].idx);
        }

    }
}