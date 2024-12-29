
import java.util.Scanner;

public class Cumulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n-1];
        int m = sc.nextInt();
        for(int i =0;i<m;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            for(int j=x-1;j<y;j++){
                arr[j]+=z;
            }
            for(int j=0;j<n-1;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
}
