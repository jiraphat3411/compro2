import java.util.Scanner;

public class Partition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = arr[n/2];
        int[] arr_1 = new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=k){
                arr_1[count] = arr[i];
                count++;
            }
        }
        for(int i=0;i<count;i++){
            if(arr_1[i]<=arr_1[count/2]){
                System.out.print(arr_1[i]+" ");
            }
        }
        System.out.println();
        for(int i=0;i<n;i++){
            if(arr_1[i]>arr_1[count/2]){
                System.out.print(arr_1[i]+" ");
            }
        }
    }
}
