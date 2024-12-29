
import java.util.Scanner;


public class NumReduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x==1){
                for(int j=0;j<3;j++){
                    if(arr[j]<=0){
                        continue;
                    }
                    if(arr[j]-y<=0){
                        arr[j]=0;
                        continue;
                    }
                    arr[j]-=y;
                }
            }else if(x==2){
                for(int j=0;j<4;j++){
                    if(arr[j]<=0){
                        continue;
                    }
                    if(arr[j]-y<=0){
                        arr[j]=0;
                        continue;
                    }
                    arr[j]-=y;
                }
            }else if(x==n-1){
                for(int j=n-4;j<n;j++){
                    if(arr[j]<=0){
                        continue;
                    }
                    if(arr[j]-y<=0){
                        arr[j]=0;
                        continue;
                    }
                    arr[j]-=y;
                }
            }else if(x==n){
                for(int j=n-3;j<n;j++){
                    if(arr[j]<=0){
                        continue;
                    }
                    if(arr[j]-y<=0){
                        arr[j]=0;
                        continue;
                    }
                    arr[j]-=y;
                }
            }else{
                for(int j=x-3;j<x+2;j++){
                    if(arr[j]<=0){
                        continue;
                    }
                    if(arr[j]-y<=0){
                        arr[j]=0;
                        continue;
                    }
                    arr[j]-=y;
                }
            }
            for(int j=0;j<n;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
}
