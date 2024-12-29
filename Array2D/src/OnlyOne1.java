
import java.util.Scanner;

public class OnlyOne1 {

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
        int max=0,index=0;
        for (int i = 0; i < col; i++) {
            int count=0;
            for (int j = 0; j < row; j++) {
                if(arr[j][i]==1){
                    count++;
                }
            }
            if(count>=max){
                max=count;
                index = i+1;
            }
        }
        //System.out.println("max = "+max);
        System.out.println(max+"\n"+index);
    }
}

