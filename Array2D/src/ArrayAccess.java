
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayAccess {

    public static void main(String[] arge) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        int[][] arr = new int[n][];
        for(int i=0;i<n;i++){
            m[i] = sc.nextInt();
            arr[i] = new int[m[i]];
            for(int j=0;j<m[i];j++){
                arr[i][j] = sc.nextInt();
            }
        }
        /*for(int i=0;i<n;i++){
            for(int j=0;j<m[i];j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,wrong=0;
        while(true){
            int Array = sc.nextInt();
            if(Array==0){
                break;
            }
            int index = sc.nextInt();
            if(Array<=0||Array>n||index<0||index>(m[Array-1])-1){
                wrong++;
                continue;
            }
            if(arr[Array-1][index]>max){
                max = arr[Array-1][index];
            }
            if(arr[Array-1][index]<min){
                min = arr[Array-1][index];
            }
            sum+=arr[Array-1][index];
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
        System.out.println(wrong);
    }
}
