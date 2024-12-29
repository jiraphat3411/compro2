import java.util.Scanner;

public class Partition1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = n/2;
        for(int i=0;i<n;i++){
            if(arr[i]<=arr[k]){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        for(int i=0;i<n;i++){
            if(arr[i]>arr[k]){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
