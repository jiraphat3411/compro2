
import java.util.Scanner;

public class SupremeMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0, super_max = 0;
        int index = 0,count = 0;
        boolean b = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                count++;
                b = true;
            } else if(b){
                System.out.print(max + " ");
                if (max > super_max) {
                    super_max = max;
                    index = i-count;
                    //System.out.print(" = "+i +" "+ count+" ");
                    //System.out.println("index = "+index);
                }
                count = 0 ;
                max = 0;
                b = false;
            }
        }
        System.out.println("\n" + super_max/*+" "+index*/);
        for(int i=index;;i++){
            if(arr[i]==0){
                break;
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
