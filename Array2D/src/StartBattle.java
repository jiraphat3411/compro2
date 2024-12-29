
import java.util.Scanner;

public class StartBattle {

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
        int k = sc.nextInt();
        int /*count_in = 0,*/ count_out = 0;
        int count_hit = 0, count_miss = 0;
        int count_hit_again = 0, count_miss_again = 0;
        for (int i = 0; i < k; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            if (r < 1 || r > row || c < 1 || c > col) {
                count_out++;
                continue;
            }
            //count_in++;
            if (arr[r-1][c-1] == 1) {
                count_hit++;
                arr[r-1][c-1] = 2;
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
            /*for (int h = 0; h < row; h++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[h][j]+" ");
                }
                System.out.println();
            }*/
        }
        System.out.println(count_hit);
        System.out.println(count_miss);
        System.out.println(count_hit_again);
        System.out.println(count_miss_again);
        System.out.println(count_out);
    }
}