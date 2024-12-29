
import java.util.Scanner;

public class TargetLand {

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
            if(y+(x/2)>n||y-(x/2)<1){
                System.out.println("no");
                continue;
            }/*else{
                System.out.println(i+1);
            }*/
            int sum=0;
            for(int j=y-(x/2+1);j<y+(x/2);j++){
                sum+=arr[j];
            }
            System.out.println(sum);
        }
    }
}
