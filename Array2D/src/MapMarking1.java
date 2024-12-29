
import java.util.Scanner;

public class MapMarking1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        int r = sc.nextInt();
        int c = sc.nextInt();
        /*for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        int index_r = r - 1;
        int index_c = c - 1;
        arr[index_r][index_c]=1;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            //count++;
            if (x == 1) {
                if (index_c - 1 < 0) {
                    //count--;
                    continue;
                }
                index_c -= 1;
                arr[index_r][index_c]=1;
            }
            if (x == 2) {
                if (index_c + 1 >= col) {
                    //count--;
                    continue;
                }
                index_c += 1;
                arr[index_r][index_c]=1;
            }
            if (x == 3) {
                if (index_r - 1 < 0) {
                    //count--;
                    continue;
                }
                index_r -= 1;
                arr[index_r][index_c]=1;
            }
            if (x == 4) {
                if (index_r + 1 >= row) {
                    //count--;
                    continue;
                }
                index_r += 1;
                arr[index_r][index_c]=1;
            }
            //System.out.println((index_r) + " " + (index_c));
            //System.out.print(count+" ");
        }
        int count = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
        }
        System.out.println((index_r+1)+" "+(index_c+1));
        System.out.println(count);
    }
}
