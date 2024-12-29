
import java.util.Scanner;

public class OnlyOne3 {

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
        /*for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        int r = sc.nextInt();
        int c = sc.nextInt();
        if(r<1){
            r=1;
        }
        if(r>row){
            r=row;
        }
        if(c<1){
            c=1;
        }
        if(c>col){
            c=col;
        }
        //System.out.println(r+" "+c);
        int count=0;
        for (int i = 0; i < col; i++) {
            if(arr[r-1][i]==1){
                count++;
            }
        }
        for (int i = 0; i < row; i++) {
            if(arr[i][c-1]==1){
                count++;
            }
        }
        if(arr[r-1][c-1]==1){
            count--;
        }
        //System.out.println("count = "+count);
        System.out.println(count);
    }
}
