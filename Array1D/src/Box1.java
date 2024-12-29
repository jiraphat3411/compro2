
import java.util.Scanner;


public class Box1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr_1 = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            //System.out.println("arr_1["+z+"] = "+arr_1[z-1]);
            if(x==1){
                if(arr_1[z-1]+y<=arr[z-1]){
                    arr_1[z-1]+=y;
                    System.out.println(arr_1[z-1]);
                }else{
                    System.out.println("-1");
                }
            }else{
                if(arr_1[z-1]-y>=0){
                    arr_1[z-1]-=y;
                    System.out.println(arr_1[z-1]);
                }else{
                    System.out.println("-1");
                }
            }
        }
    }
}
