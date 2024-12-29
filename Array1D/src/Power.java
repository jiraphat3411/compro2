
import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr_1 = new int[n];
        for(int i=0;i<n;i++){
            arr_1[i]=sc.nextInt();
        }
        int[] arr_2 = new int[n];
        for(int i=0;i<n;i++){
            arr_2[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sum=0;
            if(y+(x/2)>n||y-(x/2)<1){
                for(int j=y-(x/2+1);j<y+(x/2);j++){
                    if(j>=0&&j<n){
                        sum+=arr[j];
                    }
                }
                System.out.println("no "+sum);
                continue;
            }
            int count=0,count_1=0;
            boolean power = false;
            for(int j=y-(x/2+1);j<y+(x/2);j++){
                sum+=arr[j];
                count++;
                if(arr_1[j]>=5){
                    count_1++;
                }
                if(arr_2[j]==1){
                    power=true;
                }
            }
            if(count==count_1){
                if(power){
                    System.out.println(sum+" labor power");
                }else{
                    System.out.println(sum+" labor");
                }
            }else{
                if(power){
                    System.out.println(sum+" power");
                }else{
                    System.out.println(sum);
                }
            }
        }
    }
}
