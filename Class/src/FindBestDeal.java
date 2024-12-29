
import java.util.ArrayList;
import java.util.Scanner;

class ProductInfo {

    String name;
    int minprice = Integer.MAX_VALUE;
    int maxprice = Integer.MIN_VALUE;

    public ProductInfo(String name, int[] price) {
        this.name = name;
        for (int i = 0; i < price.length; i++) {
            if (price[i] > maxprice) {
                maxprice = price[i];
            }
            if (price[i] < minprice) {
                minprice = price[i];
            }
        }
    }

    void printInfo() {
        System.out.println(name + " " + minprice + " " + maxprice);
    }
}

class Store {

    private ArrayList<ProductInfo> products = new ArrayList<ProductInfo>();

    void enterProductInfo(Scanner sc) {
        String name = sc.next();
        int n = sc.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        products.add(new ProductInfo(name, price));
    }

    void printAllProductInfo() {
        for (int i = 0; i < products.size(); i++) {
            products.get(i).printInfo();
        }
    }

    ArrayList<ProductInfo> search(String name) {
        ArrayList<ProductInfo> result = new ArrayList<ProductInfo>();
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).name.indexOf(name)!=-1){
                result.add(products.get(i));
            }
        }
        return result;
    }
}

public class FindBestDeal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Store store = new Store();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            store.enterProductInfo(sc);
        }
        String productName = sc.next();
        //
        ArrayList<ProductInfo> result = store.search(productName);
        if(result.size()==0){
            System.out.println(result.size());
            System.out.println("product not found");
        }else{
            System.out.println(result.size());
            for(int i=0;i<result.size();i++){
                result.get(i).printInfo();
            }
        }
    }
}
