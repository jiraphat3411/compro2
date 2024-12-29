
import java.util.Scanner;

public class ArrayExploration2 {

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
        int even = 0, odd = 0;
        int plus = 0, delete = 0;
        int n = sc.nextInt();
        int temp_r = 0, temp_c = 0;
        for (int i = 0; i < n; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            if (r < 1 || r > row || c < 1 || c > col) {
                r = temp_r;
                c = temp_c;
            }
            if (arr[r - 1][c - 1] % 2 == 0) {
                even++;
                temp_r = r;
                temp_c = c;
            } else {
                odd++;
                temp_r = r;
                temp_c = c;
            }
            if (arr[r - 1][c - 1] < 0) {
                delete++;
                temp_r = r;
                temp_c = c;
            }
            if (arr[r - 1][c - 1] > 0) {
                plus++;
                temp_r = r;
                temp_c = c;
            }
        }
        System.out.println(plus + " " + delete + " " + even + " " + odd);
    }
}
