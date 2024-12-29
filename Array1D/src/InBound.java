
import java.util.Scanner;


public class InBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean found = false;
        for(int i=0;i<n;i++){
            if(arr[i]>=x&&arr[i]<=y){
                System.out.print(arr[i]+" ");
                found=true;
            }
        }
        if(!found){
            System.out.println("no data");
        }
    }
}
