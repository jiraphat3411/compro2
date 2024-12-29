
import java.util.Scanner;

public class NumTable3 {

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
        int n = sc.nextInt();
        boolean N = true;
        int max = 0,count=0,num_max=0;
        //int num = 10;
        int[] r = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            //int r = sc.nextInt();
            //int c = sc.nextInt();
            r[i] = sc.nextInt();
            c[i] = sc.nextInt();
            boolean b_r = r[i] < 1 || r[i] > row;
            boolean b_c = c[i] < 1 || c[i] > col;
            if (b_r || b_c) {
                if (!N) {
                    /*System.out.println();
                    num = -1;*/
                    if(count>max){
                        max=count;
                    }
                    N = true;
                    //System.out.println("c = "+count);
                    count=0;
                    continue;
                }
                continue;
            }
            /*if (num == arr[r - 1][c - 1]) {
                System.out.print("*");
            } else {
                num = arr[r - 1][c - 1];
                System.out.print(arr[r - 1][c - 1]);
            }*/
            count++;
            N = false;
        }
        if(count>max){
           max=count;
        }
        count=0;
        N = true;
        for (int i = 0; i < n; i++) {
            boolean b_r = r[i] < 1 || r[i] > row;
            boolean b_c = c[i] < 1 || c[i] > col;
            if (b_r || b_c) {
                if (!N) {
                    if(count==max){
                        num_max++;
                    }
                    N = true;
                    count=0;
                    continue;
                }
                continue;
            }
            count++;
            N = false;
        }
        if(count==max){
           num_max++;
        }
        System.out.println(max+"\n"+num_max);
    }
}
