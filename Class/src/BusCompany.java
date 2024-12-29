
import java.util.Scanner;

class Bus {

    public String ID;
    public int Type;
    public int seatBus;
    public int reserveBus;
    public int statusBus;

    public Bus(String ID, int Type, int seatBus) {
        this.ID = ID;
        this.Type = Type;
        this.seatBus = seatBus;
        this.reserveBus = 0;
        this.statusBus = 0;
    }

    void printStats() {
        System.out.println(ID);
        if (Type == 1) {
            System.out.println("Fan");
        } else if (Type == 2) {
            System.out.println("P1");
        } else {
            System.out.println("VIP");
        }
        System.out.println(reserveBus + " " + seatBus);
        if (statusBus == 0) {
            System.out.println("Active");
        } else {
            System.out.println("Inactive");
        }
    }
    
    boolean reserve(int k){
        boolean b = k>=0&&statusBus==0&&k+reserveBus<=seatBus;
        if(b){
            reserveBus+=k;
        }
        return b;
    }
    
    void sendToRepair(){
        statusBus = 1;
    }
    
    void  backToService(){
        statusBus = 0;
    }
}

public class BusCompany {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ID = sc.next();
        int Type = sc.nextInt();
        int seatBus = sc.nextInt();
        Bus bus = new Bus(ID,Type,seatBus);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int p = sc.nextInt();
            int k = sc.nextInt();
            if(p==1){
                bus.reserve(k);
            }else if(p==2){
                bus.sendToRepair();
            }else{
                bus.backToService();
            }
            bus.printStats();
        }
    }
}
