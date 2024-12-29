
import java.util.Scanner;

public class Lease2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int year = sc.nextInt();
        int[] arr_1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr_1[i] = arr[i]+year;
            //System.out.println(arr_1[i]+" ");
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            boolean temp = false;
            for (int j = 0; j < n; j++) {
                if(x>=arr_1[j]){
                    System.out.print((j+1)+" ");
                    temp = true;
                }
            }
            if(temp==false){
                System.out.print("full");
            }
            System.out.println("");
        }
    }
}
