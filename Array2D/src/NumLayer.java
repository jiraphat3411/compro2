
import java.util.Scanner;

public class NumLayer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int arr[][] = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][j]=-1;
            }
        }
        //
        int r = 0,c = 0;
        while(true){
            int count = 0;
            if(arr[r][c]!=-1){
                break;
            }
            for (int i = c; i < C-c; i++) {
                arr[r][i]=count%10;
                count++;
            }
            for (int i = r+1; i < R-r; i++) {
                arr[i][C-(c+1)]=count%10;
                count++;
            }
            for (int i = C-(c+2); i > r-1; i--) {
                arr[R-(r+1)][i]=count%10;
                count++;
            }
            for (int i = R-(r+2); i > c; i--) {
                arr[i][c]=count%10;
                count++;
            }
            r++;
            c++;
        }
        //
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
