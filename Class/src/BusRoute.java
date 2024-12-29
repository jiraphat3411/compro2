
import java.util.Scanner;

class Route {

    public String[] name;
    public int[] distance;

    Route(String[] name, int[] distance) {
        this.name = name;
        this.distance = distance;
    }

    void getStopInfo(int num) {
        if (num < 1 || num > name.length) {
            System.out.println("invalid number");
        } else {
            System.out.println(name[num - 1] + " " + distance[num - 1]);
        }
    }

    void summarizeRoute() {
        int sum = 0;
        for (int i = 0; i < name.length; i++) {
            sum += distance[i];
        }
        System.out.println(name[0] + " " + name[name.length - 1] + " " + sum);
    }

    int getTripInfo(int x, int y) {
        boolean b = x < y && x >= 1 && y <= name.length;
        int sum = 0;
        if (b) {
            for (int i = x; i < y; i++) {
                sum+=distance[i];
            }
        }
        return sum;
    }
}

public class BusRoute {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] distance = new int[n];
        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            distance[i] = sc.nextInt();
        }
        Route route = new Route(name, distance);
        /*for(int i=0;i<n;i++){
            System.out.println(route.name[i]+" "+route.distance[i]);
        }*/
 /*int m = sc.nextInt();
        for(int i=0;i<m;i++){
            int num = sc.nextInt();
            route.getStopInfo(num);
        }*/
        //route.summarizeRoute();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sum = route.getTripInfo(x, y);
            if(sum==0){
                System.out.println("invalid number");
                continue;
            }
            System.out.println(name[x-1] + " " + name[y-1] + " " + sum);
        }
    }
}
