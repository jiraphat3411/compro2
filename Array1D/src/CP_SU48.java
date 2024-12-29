import java.util.Scanner;

public class CP_SU48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr_1 = new int[n];
        int[] arr_2 = new int[n];
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(y==1){
                if(arr_1[x-1]<k1){
                    arr_1[x-1]++;
                    System.out.println("1");
                }else if(arr_2[x-1]<k2){
                    arr_2[x-1]++;
                    System.out.println("2");
                }else{
                    System.out.println("0");
                }
            }else{
                if(arr_2[x-1]<k2){
                    arr_2[x-1]++;
                    System.out.println("2");
                }else if(arr_1[x-1]<k1){
                    arr_1[x-1]++;
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }
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