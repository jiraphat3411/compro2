
import java.util.Scanner;

public class ArrayOcc1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[k];
        int suc=0,over=0,aga=0,max=0;
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            if(x>0&&x<=k){
                arr[x-1]++;
                
                if(arr[x-1]==1){
                    suc++;
                }else{
                    aga++;
                }
                if(arr[x-1]>max){
                    max=arr[x-1];
                }
            }else{
                over++;
            }
        }
        System.out.println(suc);
        System.out.println(over);
        System.out.println(aga);
        for(int i=0;i<k;i++){
            //System.out.print(arr[i]+" ");
            if(arr[i]==max){
                System.out.print(i+1+" ");
            }
        }
        
    }
}
