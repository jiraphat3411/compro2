
import java.util.Scanner;

class Theater {

    boolean D3;
    boolean luxury;
    int seat;
    boolean[] seats;
    String title;
    int basePrice;

    Theater(boolean D3, boolean luxury, int seat) {
        this.D3 = D3;
        this.luxury = luxury;
        this.seat = seat;
        this.seats = new boolean[seat + 1];
    }

    void setTitle(String title) {
        if (title == null || title.length() == 0) {
            System.out.println("invalid title");
        } else {
            if (title.charAt(0) == 45) {
                System.out.println("invalid title");
            } else {
                this.title = title;
            }

        }
    }

    void setBasePrice(int basePrice) {
        if (basePrice <= 0) {
            System.out.println("invalid price");
        } else {
            this.basePrice = basePrice;
        }
    }

    void printInfo() {
        if (D3) {
            System.out.println("3D");
        } else {
            System.out.println("No 3D");
        }
        if (luxury) {
            System.out.println("Luxury");
        } else {
            System.out.println("Standard");
        }
        System.out.println(seats.length - 1);
        if (title == null || title.length() <= 0) {
            System.out.println("title is not set");
        } else {
            System.out.println(title);
        }
        if (basePrice == 0) {
            System.out.println("price is not set");
        } else {
            System.out.println(basePrice);
        }
    }

    int reserveOne(int seatNumber) {
        if (seatNumber <= 0 || seatNumber > seat || seats[seatNumber] == true) {
            System.out.println("sorry");
            return -1;
        }
        seats[seatNumber] = true;
        return basePrice;
    }

    int reserveMultiple(int numSeats, int seatNumber) {
        if (seatNumber + numSeats - 1 > seat || seatNumber <= 0 || seatNumber > seat) {
            System.out.println("sorry");
            return -1;
        }
        for (int i = seatNumber; i < seatNumber + numSeats; i++) {
            if (seats[i] == true) {
                System.out.println("sorry");
                return -1;
            }
        }
        for (int i = seatNumber; i < seatNumber + numSeats; i++) {
            seats[i] = true;
        }
        return basePrice * numSeats;
    }
}

public class Theater0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int VarD = sc.nextInt();
        int VarL = sc.nextInt();
        int seat = sc.nextInt();
        boolean D3 = VarD == 1;
        boolean luxury = VarL == 1;
        sc.nextLine();
        String title = sc.nextLine();
        int basePrice = sc.nextInt();
        Theater th = new Theater(D3, luxury, seat);
        th.setTitle(title);
        th.setBasePrice(basePrice);
        //th.printInfo();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int numSeats = sc.nextInt();
            int seatNumber = sc.nextInt();
            if (numSeats == 1) {
                int Price = th.reserveOne(seatNumber);
                if (Price != -1) {
                    System.out.println(Price);
                }
                continue;
            }
            int Price = th.reserveMultiple(numSeats, seatNumber);
            if (Price != -1) {
                System.out.println(Price);
            }
        }
        th.printInfo();
    }
}
