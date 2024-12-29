
import java.util.Scanner;

public class NumTable2 {

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
        int num = 10;
        boolean N = true;
        for (int i = 0; i < n; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            boolean b_r = r < 1 || r > row;
            boolean b_c = c < 1 || c > col;
            if (b_r || b_c) {
                if (!N) {
                    System.out.println();
                    num = -1;
                    N = true;
                    continue;
                }
                continue;
            }
            if (num == arr[r - 1][c - 1]) {
                System.out.print("*");
            } else {
                num = arr[r - 1][c - 1];
                System.out.print(arr[r - 1][c - 1]);
            }
            N = false;
        }
    }
}
