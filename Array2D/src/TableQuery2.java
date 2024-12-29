
import java.util.Scanner;

public class TableQuery2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int s_r = sc.nextInt();
        int e_r = sc.nextInt();
        int s_c = sc.nextInt();
        int e_c = sc.nextInt();
        if(s_r<1){
            s_r=1;
        }
        if(e_r>row){
            e_r=row;
        }
        if(s_c<1){
            s_c=1;
        }
        if(e_c>col){
            e_c=col;
        }
        for (int i = s_r-1; i < e_r; i++) {
            for (int j = s_c-1; j < e_c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
