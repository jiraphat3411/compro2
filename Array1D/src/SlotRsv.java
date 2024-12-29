
import java.util.Scanner;

public class SlotRsv {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr_1 = new int[n];
        int[] arr_2 = new int[n];
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            int x = sc.nextInt();
            if(arr_1[x-1]<k){
                arr_1[x-1]++;
                System.out.println("1");
                continue;
            }
            arr_2[x-1]++;
            System.out.println("2");
        }
        for(int i=0;i<n;i++){
            System.out.print(arr_1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr_2[i]+" ");
        }
    }
}
