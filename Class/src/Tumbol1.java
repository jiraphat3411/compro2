
//import java.util.ArrayList;
import java.util.Scanner;

class Tumbol {

    public String name;
    public int x;
    public int y;
    public int pp;
    public int availBudget;

    public Tumbol(String name, int x, int y, int pp) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.pp = pp;
        this.availBudget = pp * 5000;
    }

    public int allocateBudget(int[] arr) {
        int Budget = availBudget;
        boolean b = true;
        for (int i = 0; i < arr.length; i++) {
            if (Budget < arr[i]) {
                continue;
            }
            Budget -= arr[i];
            b = false;
            System.out.print((i + 1) + " ");
        }
        if (b) {
            System.out.println("none");
        } else {
            System.out.println();
        }
        return availBudget - Budget;
    }
}

public class Tumbol1 {

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Tumbol> tb = new ArrayList<>();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String name = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int pp = sc.nextInt();
            Tumbol tumbol = new Tumbol(name, x, y, pp);
            tb.add(i, tumbol);
        }
        int total = 0;
        for (int i = 0; i < m; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            total += tb.get(i).allocateBudget(arr);
        }
        System.out.println(total);
    }*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        Tumbol[] tb = new Tumbol[m];
        for(int i=0;i<m;i++){
            String name = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int pp = sc.nextInt();
            tb[i] = new Tumbol(name,x,y,pp);
        }
        int total = 0;
        for(int i=0;i<m;i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            total+=tb[i].allocateBudget(arr);
        }
        System.out.println(total);
    }
}
