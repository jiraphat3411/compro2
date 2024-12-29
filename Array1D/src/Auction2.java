
import java.util.Scanner;

public class Auction2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr_1 = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int x = sc.nextInt();
                if(x>arr[j]&&arr_1[j]<3){
                    arr[j]=x;
                    arr_1[j]=0;
                }else{
                    arr_1[j]++;
                }
                System.out.print(arr[j]+" ");
            }
            System.out.println("");
        }
    }
}
