
import java.util.Scanner;

public class ShotCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        /*for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }*/
        int k = sc.nextInt();
        int count_in = 0, count_out = 0;
        for (int i = 0; i < k; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            if (r < 1 || r > row || c < 1 || c > col) {
                count_out++;
                continue;
            }
            count_in++;
        }
        System.out.println(count_in+"\n"+count_out);
    }
}
