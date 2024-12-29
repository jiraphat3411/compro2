import java.util.Scanner;

public class NumMixer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr_1 = new int[n];
        for(int i=0;i<n;i++){
            arr_1[i] = sc.nextInt();
        }
        int[] arr_2 = new int[n];
        for(int i=0;i<n;i++){
            arr_2[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int index_1=0,index_2=n-1;
        if(target>0){
            for(int i=0;i<n;i++){
                System.out.print(arr_1[index_1]+" ");
                System.out.print(arr_2[index_2]+" ");
                index_1++;
                index_2--;
            }
        }else{
            for(int i=0;i<n;i++){
                System.out.print(arr_2[index_2]+" ");
                System.out.print(arr_1[index_1]+" ");
                index_1++;
                index_2--;
            }
        }
    }
}