import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int m = sc.nextInt();
        int max=0,index=0;
        for(int i=0;i<m;i++){
            int x = sc.nextInt();
            arr[x-1]++;
            if(arr[x-1]>max){
                max=arr[x-1];
                index=x;
            }
        }
        System.out.println(index+"\n"+max);
    }
}
