
import java.util.Scanner;

public class ArrayOcc2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[k];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x > 0 && x <= k) {
                arr[x - 1]++;
            }
        }
        int count = 0, max = 0;
        for (int i = 0; i < k; i++) {
            if (arr[i] == 0) {
                count++;
            } else {
                count = 0;
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
        /*for (int i = 1; i < k; i++) {
            if(arr[i]!=0&&arr[i-1]==0){
                System.out.print(i+" ");
            }
        }
        if(arr[k-1]==0){
            System.out.println(k);
        }*/
        count=0;
        for (int i = 0; i < k; i++) {
            if (arr[i] == 0) {
                count++;
            } else {
                count = 0;
            }
            if(count==max){
                System.out.print((i+1)+" ");
            }
        }
    }
}
