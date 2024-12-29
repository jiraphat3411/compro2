import java.util.Scanner;

public class ConsecSale {
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
                //count++;
            }
        }
        int max=0,count_1=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
                count_1++;
            }else{
                count_1=0;
            }
            if(count_1>max){
                max=count_1;
            }
            /*System.out.println(max);
            System.out.println(arr[i]+" count_1 = "+count_1);*/
        }
        System.out.println(count);
        System.out.println(max);
    }
}