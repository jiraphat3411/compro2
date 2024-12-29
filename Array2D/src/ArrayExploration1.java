
import java.util.Scanner;

public class ArrayExploration1 {

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
            for(int j = 0;j<col;j++){
                System.out.print(arr[i][j]%2+" ");
            }
            System.out.println();
        }*/
        int even = 0, odd = 0;
        int plus = 0, delete = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            if (r < 1 || r > row || c < 1 || c > col) {
                continue;
            }
            //System.out.print(arr[r-1][c-1]+" ");
            if(arr[r-1][c-1]%2==0){
                even++;
            }else{
                odd++;
            }
            if(arr[r-1][c-1]<0){
                delete++;
            }
            if(arr[r-1][c-1]>0){
                plus++;
            }
        }
        System.out.println(plus+" "+delete+" "+even+" "+odd);
    }
}
