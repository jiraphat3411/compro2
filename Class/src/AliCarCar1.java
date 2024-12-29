
import com.sun.source.doctree.IdentifierTree;
import java.util.Scanner;

class Car {
    //String ID;

    String name;
    int price;
    int power;

    Car(/*String ID,*/String name, int price, int power) {
        //this.ID = ID;
        this.name = name;
        this.price = price;
        this.power = power;
    }

    static boolean check(String name, int price, int power) {
        boolean b = name.length() != 0 && name != null && price > 0 && power > 0;
        return b;
    }
}

class Factory {

    Car[] cars;
    boolean[] ID;
    int powertotal;

    Factory(Car[] cars, boolean[] ID, int powertotal) {
        this.cars = cars;
        this.ID = ID;
        this.powertotal = powertotal;
    }

    void print() {
        System.out.print(powertotal + " ");
        for (int i = 1; i < ID.length; i++) {
            System.out.print(ID[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < cars.length; i++) {
            //System.out.println(cars[i].name+" "+cars[i].price+" "+cars[i].power);
            System.out.println(cars[i].name);
        }
    }
}

public class AliCarCar1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int N = sc.nextInt();
		Car[] cars = new Car[N];
		int count = 1;
		for(int i = 0; i < N; ++i) {
			String name = sc.next();
			int price = sc.nextInt();
			int labor = sc.nextInt();
			if(Car.check(name, price, labor)) {
				cars[count] = new Car(name,price,labor);
                                count++;
				System.out.println("valid");
			} else {
				System.out.println("invalid");
			}
		}	
		for(int i=1;i<count;i++){
                    System.out.println(i + " " + cars[i].name);
                }*/
        int N = sc.nextInt();
        Car[] car = new Car[N];
        int count = 1;
        for (int i = 0; i < N; ++i) {
            String name = sc.next();
            int price = sc.nextInt();
            int labor = sc.nextInt();
            if (Car.check(name, price, labor)) {
                car[count] = new Car(name, price, labor);
                count++;
            }
        }
        Car[] cars = new Car[count];
        for (int i = 1; i < count; i++) {
            cars[i] = new Car(car[i].name, car[i].price, car[i].power);
        }
        Factory[] fty = new Factory[6];
        for (int i = 1; i <= 5; i++) {
            int powertotal = sc.nextInt();
            boolean[] ID = new boolean[N + 1];
            for (int j = 1; j <= N; j++) {
                int x = sc.nextInt();
                if (x == 0) {
                    ID[j] = false;
                } else {
                    ID[j] = true;
                }
            }
            fty[i] = new Factory(cars, ID, powertotal);
        }
        /*for (int i = 1; i <= 5; i++) {
            fty[i].print();
        }*/
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int index = sc.nextInt();
            if(index>=count){
                System.out.println("invalid model");
                continue;
            }
            boolean b = true;
            for(int j=1;j<=5;j++){
                if(fty[j].powertotal>=fty[j].cars[index].power&&fty[j].ID[index]==true){
                    System.out.println("okay "+j);
                    fty[j].powertotal-=fty[j].cars[index].power;
                    b = false;
                    break;
                }
            }
            if(b){
                System.out.println("unable to build");
            }
        }
    }
}
