import java.util.Scanner;

public class HowLongest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count=0,max=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
            }else{
                count=0;
                continue;
            }
            if(count>max){
                max=count;
            }
        }
        System.out.println(max);
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
            }else{
                count=0;
                continue;
            }
            if(count==max){
                System.out.print((i+2-max)+" ");
            }
        }
    }
}
