import java.util.*;

class Product {
    String name;
    int code;

    Product() {
        this.name = "codetree";
        this.code = 50;
    }

    Product(String name, int code) {
        this.name = name;
        this.code = code;
    }

    void printInfo() {
        System.out.printf("product %d is %s\n", this.code, this.name);
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        Product p1 = new Product();
        Product p2 = new Product(sc.next(), sc.nextInt());

        p1.printInfo();
        p2.printInfo();

        
    }
}