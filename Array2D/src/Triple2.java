
import java.util.Scanner;

public class Triple2 {

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
            int index_min = 0,index_max=0;
            boolean min = true;
            for(int j=0;j<col-2;j++){
                int count=0;
                for(int k = j;k<j+3;k++){
                    if(arr[i][k]==v){
                        count++;
                    }
                }
                //System.out.println(i+" "+j+" "+count);
                if(count==3){
                    if(min){
                        index_min=j+1;
                        min=false;
                    }
                    index_max=j+1;
                }
                //System.out.println(i+" "+j+" "+index_min);
            }
            if(index_min==0&&index_max==0){
                System.out.println("0");
                continue;
            }
            System.out.println(index_min+" "+index_max);
        }
    }
}
