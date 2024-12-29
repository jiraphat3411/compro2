
import java.util.Scanner;

public class Winner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        int target = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j]==1){
                    target++;
                }
            }
        }
        //System.out.println("t = "+ target);
        int k = sc.nextInt();
        int count_out = 0;
        int count_hit = 0, count_miss = 0;
        int count_hit_again = 0, count_miss_again = 0;
        int count=0,att=0,bat=0;
        boolean B = true;
        for (int i = 0; i < k; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            if (r < 1 || r > row || c < 1 || c > col) {
                count_out++;
                continue;
            }
            if (arr[r-1][c-1] == 1) {
                count_hit++;
                arr[r-1][c-1] = 2;
                count++;
                if(count==target){
                    att=i+1;
                }
                if(B){
                    bat=i+1;
                    B=false;
                }
                continue;
            }
            if (arr[r-1][c-1] == 0) {
                count_miss++;
                arr[r-1][c-1] = 3;
                continue;
            }
            if (arr[r-1][c-1] == 2) {
                count_hit_again++;
                arr[r-1][c-1] = 2;
                continue;
            }
            if (arr[r-1][c-1] == 3) {
                count_miss_again++;
                continue;
            }
        }
        System.out.println(count_hit);
        System.out.println(count_miss);
        System.out.println(count_hit_again);
        System.out.println(count_miss_again);
        System.out.println(count_out);
        //System.out.println("att = "+att);
        //System.out.println("bat = "+bat);
        if(count==0){
            System.out.println("battleship ­1");
        }else if(count==target){
            System.out.println("attacker "+att);
        }else{
            System.out.println("battleship "+bat);
        }
    }
}
