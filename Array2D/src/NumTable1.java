
import java.util.Scanner;

public class NumTable1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        /*for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            boolean b_r = r<1||r>row;
            boolean b_c = c<1||c>col;
            if(b_r||b_c){
                System.out.print("-");
                continue;
            }
            System.out.print(arr[r-1][c-1]);
        }
    }
}
