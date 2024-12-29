import java.util.Scanner;
public class OddEvenZero2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0||arr[i]%2!=0&&arr[i]>temp){
                System.out.print(arr[i]+" ");
                temp=arr[i];
            }
        }
        temp=0;
        System.out.println();
        for(int i=0;i<n;i++){
            if(arr[i]==0||arr[i]%2==0&&arr[i]>temp){
                System.out.print(arr[i]+" ");
                temp=arr[i];
            }
        }
    }
}
