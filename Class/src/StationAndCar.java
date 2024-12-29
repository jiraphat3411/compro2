
import java.util.Scanner;

class Station {

    int benzin;
    int diesel;

    Station(int benzin, int diesel) {
        this.benzin = benzin;
        this.diesel = diesel;
    }

    void dispense(Car car) {
        int Vol = car.getNeededVol();
        if (car.gasType == 1) {
            if (this.benzin >= Vol) {
                System.out.println("Dispense " + Vol + " liters of benzin");
                this.benzin -= Vol;
            } else {
                System.out.println("Dispense " + this.benzin + " liters of benzin");
                this.benzin = 0;
            }
        } else if (car.gasType == 2) {
            if (this.diesel >= Vol) {
                System.out.println("Dispense " + Vol + " liters of diesel");
                this.diesel -= Vol;
            } else {
                System.out.println("Dispense " + this.diesel + " liters of diesel");
                this.diesel = 0;
            }
        }
    }

    void refillBenzin(int benzin) {
        this.benzin += benzin;
        System.out.println("Station has " + this.benzin + " liters of benzin");
    }

    void refillDiesel(int diesel) {
        this.diesel += diesel;
        System.out.println("Station has " + this.diesel + " liters of diesel");
    }
}

class Car {

    int gasType;
    int capacity;
    int amount;

    Car(int Type, int capacity, int amount) {
        this.gasType = Type;
        this.capacity = capacity;
        this.amount = amount;
    }

    int getNeededVol() {
        //System.out.println("Vol = "+(capacity - amount));
        return capacity - amount;
    }
}

public class StationAndCar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int benzin = sc.nextInt();
        int diesel = sc.nextInt();
        Station stt = new Station(benzin, diesel);
        final int Q = sc.nextInt();
        for (int i = 0; i < Q; ++i) {
            final int A = sc.nextInt();
            final int B = sc.nextInt();
            final int C = sc.nextInt();
            final int D = sc.nextInt();
            if (A == 1) {
                Car car = new Car(B,C,D);
                stt.dispense(car);
            } else if (A == 2) {
                if (B == 1) {
                   stt.refillBenzin(C);
                } else if (B == 2) {
                   stt.refillDiesel(C);
                }
            }
        }
    }
}
