
import java.util.Scanner;

public class Triple1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        /*for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        int v = sc.nextInt();
        for(int i=0;i<row;i++){
            int count=0;
            for(int j=0;j<col;j++){
                if(arr[i][j]==v){
                    count++;
                    //continue;
                }else{
                    count=0;
                }
                if(count==3){
                    System.out.print((i+1)+" ");
                    count=0;
                    //System.out.println(i+" "+j+" "+count+" ");
                    break;
                }
                //count=0;
            }
            
        }
    }
}
