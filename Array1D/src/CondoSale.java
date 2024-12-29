
import java.util.Scanner;

public class CondoSale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int p = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for(int i=0;i<k;i++){
            int x = sc.nextInt();
            if(p>x||x>=p+n){
                continue;
            }
            //System.out.println(x-p);
            if(arr[x-p]==0){
                arr[x-p]=1;
                count++;
            }
        }
        System.out.println(count);
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                System.out.println(i+p);
            }
        }
    }
}
