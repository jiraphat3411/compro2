
import java.util.Scanner;

public class TargetPrice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sum=0;
            if(y+(x/2)>n||y-(x/2)<1){
                for(int j=y-(x/2+1);j<y+(x/2);j++){
                    if(j>=0&&j<n){
                        //System.out.print(arr[j]+" ");
                        sum+=arr[j];
                    }
                }
                System.out.println("no "+sum);
                continue;
            }
            for(int j=y-(x/2+1);j<y+(x/2);j++){
                sum+=arr[j];
            }
            System.out.println(sum);
        }
    }
}
