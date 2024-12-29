
import java.util.Scanner;

public class ColumnSummary {

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
        int x = sc.nextInt();
        int count = 0;
        int[] count_arr = new int[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == x) {
                    count++;
                    count_arr[j]++;
                }
            }
        }
        for (int i = 0; i < col; i++) {
            if (count_arr[i] > 0) {
                System.out.print(count_arr[i] + " ");
                continue;
            }
            System.out.print("* ");
        }
        System.out.println("\n"+count);
    }
}
