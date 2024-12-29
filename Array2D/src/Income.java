
import java.util.Scanner;

public class Income {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int index_r = sc.nextInt();
            int index_c = sc.nextInt();
            int plus_r = sc.nextInt();
            int plus_c = sc.nextInt();
            int r = plus_r + index_r - 1;
            int c = plus_c + index_c - 1;
            boolean T1 = index_r <= 0 || index_r > row || index_c <= 0 || index_c > col;
            boolean T2 = r > row || c > col;
            boolean T3 = false;
            if (T1 || T2) {
                continue;
            }
            for (int j = index_r - 1; j < r; j++) {
                for (int k = index_c - 1; k < c; k++) {
                    if(arr[j][k]==1){
                        T3 = true;
                    }
                }
            }
            if(T3){
                continue;
            }
            for (int j = index_r - 1; j < r; j++) {
                for (int k = index_c - 1; k < c; k++) {
                    arr[j][k] = 1;
                }
            }
        }
        int sum=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int x = sc.nextInt();
                if(arr[i][j]==1){
                    sum+=x;
                }
                arr[i][j]=x;
            }
        }
        /*for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/
        System.out.println(sum);
    }
}
