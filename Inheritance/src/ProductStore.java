
import java.util.ArrayList;
import java.util.Scanner;

class Product {

    String name;
    String sku;
    double price;
    int weight;
    //public boolean[] valid = new boolean[4];
    boolean valid;

    Product(String name, String sku, double price, int weight) {
        this.name = name;
        this.sku = sku;
        this.price = price;
        this.weight = weight;
        /*for(int i=0;i<4;i++){
            valid[i] = true;
        }*/
    }

    boolean checkValidity() {
        boolean b = true;
        if (name.length() == 0 || name == null) {
            System.out.println("name is invalid");
            b = false;
            //valid[0] = b;
        }
        if (sku.length() == 0 || sku == null) {
            System.out.println("sku is invalid");
            b = false;
            //valid[1] = b;
        }
        if (price < 0.0) {
            System.out.println("price is invalid");
            b = false;
            //valid[2] = b;            
        }
        if (weight < 0) {
            System.out.println("weight is invalid");
            b = false;
            //valid[3] = b;
        }
        this.valid = b;
        return b;
    }

    void printInfo() {
        System.out.print(name + ", " + sku + ", " + price + ", " + weight);
        if (valid) {
            //System.out.println(name + ", " + sku + ", " + price + ", " + weigth);
            System.out.println("");
        } else {
            //System.out.println(name + ", " + sku + ", " + price + ", " + weigth + ", Invalid");
            System.out.println(", Invalid");
        }
    }

}

public class ProductStore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> product = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            String sku = sc.nextLine();
            double price = sc.nextDouble();
            int weight = sc.nextInt();
            product.add(new Product(name, sku, price, weight));
        }
        for (int i = 0; i < n; i++) {
            boolean valid = product.get(i).checkValidity();
            System.out.println(valid);
        }
        for (int i = 0; i < n; i++) {
            product.get(i).printInfo();
        }
    }
}
