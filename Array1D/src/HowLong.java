
import java.util.Scanner;

public class HowLong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<3;i++){
            int x = sc.nextInt();
            int count = 0;
            for(int j=x-1;j<n;j++){
                if(arr[j]==0){
                    break;
                }else{
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
