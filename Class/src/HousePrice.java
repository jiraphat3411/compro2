
import java.util.Scanner;

class House {

    public int landSize;
    public int quality;
    public int floors;
    public int houseArea;
    public int price;

    public House(int landSize, int quality, int floors, int houseArea) {
        this.landSize = landSize;
        this.quality = quality;
        this.floors = floors;
        this.houseArea = houseArea;
        this.price = this.computePrice(landSize, quality, floors, houseArea);
    }

    int computePrice(int landSize, int quality, int floors, int houseArea) {
        int price = (landSize * 10000) + ((floors - 1) * 200000);
        if (quality == 1) {
            price += (houseArea * 10000);
        } else if (quality == 2) {
            price += (houseArea * 8000);
        } else {
            price += (houseArea * 5000);
        }
        return price;
    }
}

public class HousePrice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        House[] house = new House[n];
        for (int i = 0; i < n; i++) {
            int landSize = sc.nextInt();
            int quality = sc.nextInt();
            int floors = sc.nextInt();
            int houseArea = sc.nextInt();
            house[i] = new House(landSize, quality, floors, houseArea);
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean none = true;
        for (int i = 0; i < n; i++) {
            boolean b = house[i].price <= x && house[i].houseArea >= y;
            if (b) {
                System.out.print(house[i].landSize + " " + house[i].quality + " " + house[i].floors + " " + house[i].houseArea);
                System.out.println(" "+house[i].price);
                none = false;
            }
        }
        if(none){
            System.out.println("none");
        }
        //System.out.println(house.landSize + " " + house.quality + " " + house.floors + " " + house.houseArea);
        //System.out.println(house.price);
    }
}
