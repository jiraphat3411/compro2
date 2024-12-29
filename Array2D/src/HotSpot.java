
import java.util.Scanner;

public class HotSpot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        /*for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(target);*/
        int count=0,max=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                //System.out.println(i+"=="+j);
                //System.out.println("row");
                for(int k=0;k<row;k++){
                    if(arr[k][j]==target){
                        count++;
                        //System.out.println(k+" "+j+" ");
                    }
                }
                //System.out.println("col");
                for(int k=0;k<col;k++){
                    if(arr[i][k]==target){
                        count++;
                        //System.out.println(i+" "+k+" ");
                    }
                }
                if(arr[i][j]==target){
                    count--;
                }
                if(count>max){
                    max=count;
                }
                //System.out.println("count = "+count);
                count=0;
            }
        }
        //System.out.println("max = "+max);
        System.out.println(max);
        int num = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                for(int k=0;k<row;k++){
                    if(arr[k][j]==target){
                        count++;
                    }
                }
                for(int k=0;k<col;k++){
                    if(arr[i][k]==target){
                        count++;
                    }
                }
                if(arr[i][j]==target){
                    count--;
                }
                if(count==max){
                    num++;
                }
                count=0;
            }
        }
        //System.out.println("num = "+num);
        System.out.println(num);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                for(int k=0;k<row;k++){
                    if(arr[k][j]==target){
                        count++;
                    }
                }
                for(int k=0;k<col;k++){
                    if(arr[i][k]==target){
                        count++;
                    }
                }
                if(arr[i][j]==target){
                    count--;
                }
                if(count==max){
                    System.out.println((i+1)+" "+(j+1));
                }
                count=0;
            }
        }
    }
}
