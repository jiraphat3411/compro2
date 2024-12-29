
import java.util.Scanner;


public class Subregion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        /*for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
            }
        }*/
        int index_r = sc.nextInt();
        int index_c = sc.nextInt();
        int plus_r = sc.nextInt();
        int plus_c = sc.nextInt();
        int r = plus_r+index_r-1;
        int c = plus_c+index_c-1;
        boolean T1 = index_r<=0||index_r>row||index_c<=0||index_c>col;
        boolean T2 = r>row||c>col;
        if(T1||T2){
            System.out.println("invalid input");
            return;
        }
        for(int i=index_r-1;i<r;i++){
            for(int j=index_c-1;j<c;j++){
                arr[i][j] = 1;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
