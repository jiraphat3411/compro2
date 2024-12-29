import java.util.Scanner;

public class NumberOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        boolean real=true;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.print(i+1+" ");
                real=false;
            }
        }
        if(real){
            System.out.println("0");
        }
    }
}
