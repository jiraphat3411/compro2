
import java.util.Scanner;

class FieldManager {

    int numbeds;
    int[] statusbed;

    FieldManager(int numbeds) {
        this.numbeds = numbeds;
        this.statusbed = new int[numbeds];
    }

    int reserveBed() {
        for (int i = 0; i < numbeds; i++) {
            if (statusbed[i] == 0) {
                statusbed[i] = 1;
                return  i + 1;
            }
        }
        return -1;
    }

    boolean discharge(int index) {
        if (statusbed[index - 1] == 0) {
            System.out.println("Invalid bed number");
            return false;
        }
        statusbed[index - 1] = 0;
        System.out.println("Patient discharged");
        return true;
    }

    void reportBed() {
        int sum = 0;
        for (int i = 0; i < numbeds; i++) {
            if (statusbed[i] == 1) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}

public class FieldHospital {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FieldManager bed = new FieldManager(n);
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            int k = sc.nextInt();
            int a = sc.nextInt();
            if(k==1){
                int b = bed.reserveBed();
                if(b==-1){
                    System.out.println("No bed vacancy");
                }else{
                    System.out.println("Bed "+b+" reserved");
                }
            }else if(k==2){
                bed.discharge(a);
            }else if(k==3){
                bed.reportBed();
            }
        }
    }
}
