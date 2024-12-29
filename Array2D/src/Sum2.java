
import java.util.Scanner;


public class Sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        /*for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int sum = 0;
                for(int k=0;k<row;k++){
                    sum+=arr[k][j];
                }
                for(int k=0;k<col;k++){
                    sum+=arr[i][k];
                }
                sum-=arr[i][j];
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
