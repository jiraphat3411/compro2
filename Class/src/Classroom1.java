
import java.util.Scanner;

class Classroom {

    String name;
    int seat;
    boolean pjt;
    boolean vl;
    boolean sb;
    boolean cm;
    boolean reserve;

    Classroom(String name, int seat, boolean pjt, boolean vl, boolean sb, boolean cm) {
        this.name = name;
        this.seat = seat;
        this.pjt = pjt;
        this.vl = vl;
        this.sb = sb;
        this.cm = cm;
        this.reserve = false;
    }

    boolean isAvailable(int seat, boolean pjt, boolean vl, boolean sb, boolean cm) {
        if(pjt==false){
            pjt = this.pjt;
        }
        if(vl==false){
            vl = this.vl;
        }
        if(sb==false){
            sb = this.sb;
        }
        if(cm==false){
            cm = this.cm;
        }
        boolean b = this.seat >= seat && this.pjt == pjt && this.vl == vl && this.sb == sb && this.cm == cm;
        if (this.reserve == true) {
            b = false;
        }
        return b;
    }

    boolean reserve(int seat, boolean pjt, boolean vl, boolean sb, boolean cm) {
        boolean b = this.isAvailable(seat, pjt, vl, sb, cm);
        if (b) {
            this.reserve = true;
        }
        return b;
    }

    /*void print() {
        System.out.print(name + " ");
        System.out.print(seat + " ");
        System.out.print(pjt + " ");
        System.out.print(vl + " ");
        System.out.print(sb + " ");
        System.out.print(cm + " ");
        System.out.println(reserve);
    }*/
}

public class Classroom1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Classroom room[] = new Classroom[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int seat = sc.nextInt();
            int nProj = sc.nextInt();
            int nVisual = sc.nextInt();
            int nSmart = sc.nextInt();
            int nCam = sc.nextInt();
            boolean pjt = nProj == 1;
            boolean vl = nVisual == 1;
            boolean sb = nSmart == 1;
            boolean cm = nCam == 1;
            room[i] = new Classroom(name, seat, pjt, vl, sb, cm);
        }
        /*for (int i = 0; i < n; i++) {
            room[i].print();
        }*/
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int seat = sc.nextInt();
            int nProj = sc.nextInt();
            int nVisual = sc.nextInt();
            int nSmart = sc.nextInt();
            int nCam = sc.nextInt();
            boolean pjt = nProj == 1;
            boolean vl = nVisual == 1;
            boolean sb = nSmart == 1;
            boolean cm = nCam == 1;
            boolean b = false;
            for (int j = 0; j < n; j++) {
                b = room[j].isAvailable(seat, pjt, vl, sb, cm);
                if(b){
                    b = room[j].reserve(seat, pjt, vl, sb, cm);
                    if(b){
                        System.out.println(room[j].name);
                        break;
                    }
                }
            }
            if(b == false){
                System.out.println("classroom not available");
            }
        }
    }
}
