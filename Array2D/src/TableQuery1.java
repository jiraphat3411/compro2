
import java.util.Scanner;

public class TableQuery1 {

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
        /*for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        int T = sc.nextInt();
        int Q = sc.nextInt();
        if (Q < 1) {
            System.out.println("invalid Q");
            return;
        }
        if (T == 1) {
            if (Q > row) {
                System.out.println("invalid Q");
                return;
            }
            for (int i = 0; i < col; i++) {
                System.out.print(arr[Q - 1][i] + " ");
            }
        } else {
            if (Q > col) {
                System.out.println("invalid Q");
                return;
            }
            for (int i = 0; i < row; i++) {
                System.out.println(arr[i][Q - 1]);
            }
        }
    }
}
