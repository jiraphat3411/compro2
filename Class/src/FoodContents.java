
import java.util.Scanner;

class Food {

    String name;
    int weight;
    String component;
    int calorie;

    Food(String name, int weight, String component,int calorie) {
        this.name = name;
        this.weight = weight;
        this.component = component+" ";
        this.calorie = weight*calorie;
    }

    void addContent(int weight, String component,int calorie) {
        this.weight += weight;
        this.component += component+" ";
        this.calorie += weight*calorie;
    }

    void printInfo() {
        System.out.println(name);
        System.out.println(weight+" "+calorie);
        System.out.print(component);
    }
}

public class FoodContents {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String component = sc.next();
        int weight = sc.nextInt();
        int calorie = sc.nextInt();
        Food food = new Food(name,weight,component,calorie);
        int q = sc.nextInt();
        while (q != 0) {
            if (q == 1) {
                food.printInfo();
            } else if (q == 2) {
                String c = sc.next();
                int w = sc.nextInt();
                int l = sc.nextInt();
                food.addContent(w,c,l);
            }
            q = sc.nextInt();
        }
    }
}
