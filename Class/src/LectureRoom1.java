
import java.util.ArrayList;
import java.util.Scanner;

class LectRoom {

    public int classCode;
    public String name;
    public int capacity;
    public int currentSeats;

    public LectRoom(int classCode, String name, int capacity) {
        this.classCode = classCode;
        this.name = name;
        this.capacity = capacity;
        this.currentSeats = 0;
    }

    public boolean reserveSeats(int c) {
        boolean b = true;
        if (currentSeats + c > capacity) {
            b = false;
            return b;
        }
        currentSeats += c;
        return b;
    }
}

public class LectureRoom1 {

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        ArrayList<LectRoom> room = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            int classCode = sc.nextInt();
            String name = sc.next();
            int capacity = sc.nextInt();
            room.add(i, new LectRoom(classCode, name, capacity));
        }
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int code = sc.nextInt();
            int num = sc.nextInt();
            boolean out_b = true;
            for(int j=0;j<k;j++){
                boolean b = room.get(j).currentSeats + num <= room.get(j).capacity;
                if(room.get(j).classCode==code&&b){
                    room.get(j).currentSeats += num;
                    System.out.println(room.get(j).name);
                    out_b = false;
                    break;
                }
            }
            if(out_b){
                System.out.println("sorry");
            }
        }
    }*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        ArrayList<LectRoom> room = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            int classCode = sc.nextInt();
            String name = sc.next();
            int capacity = sc.nextInt();
            room.add(i, new LectRoom(classCode, name, capacity));
        }
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int code = sc.nextInt();
            int num = sc.nextInt();
            boolean out_b = true;
            for (int j = 0; j < k; j++) {
                if (room.get(j).classCode == code) {
                    boolean b = room.get(j).reserveSeats(num);
                    if (b) {
                        System.out.println(room.get(j).name);
                        out_b = false;
                        break;
                    }
                }
            }
            if(out_b){
                System.out.println("sorry");
            }
        }
    }
}
