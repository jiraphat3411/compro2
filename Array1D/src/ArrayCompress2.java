
import java.util.Scanner;

public class ArrayCompress2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;
        boolean temp = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == a || arr[i] == b || arr[i] == c) {
                if (temp) {
                    continue;
                }else{
                    if(i!=0){
                        System.out.print(sum + " ");
                    }
                    System.out.print(arr[i] + " ");
                    temp = true;
                    sum=0;
                }
            } else {
                sum += arr[i];
                temp = false;
            }
        }
        if(sum>0){
            System.out.println(sum);
        }
    }
}
