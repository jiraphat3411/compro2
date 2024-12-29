
import java.util.Scanner;

public class MapMarking2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        int r = sc.nextInt();
        int c = sc.nextInt();
        int index_r = r - 1;
        int index_c = c - 1;
        arr[index_r][index_c] = 1;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int count = 0;
            if (x == 1) {
                for (int j = 0; j < col; j++) {
                    if (arr[index_r][j] == 1) {
                        count++;
                    }
                }
                if (count == col) {
                    continue;
                }
                while (true) {
                    if (index_c - 1 < 0) {
                        index_c = col;
                    }
                    if (arr[index_r][index_c-1] == 0) {
                        index_c -= 1;
                        arr[index_r][index_c] = 1;
                        break;
                    }
                    index_c -= 1;
                    //arr[index_r][index_c] = 1;
                }
                //System.out.println((index_r + 1) + " " + (index_c + 1));
            }
            if (x == 2) {
                for (int j = 0; j < col; j++) {
                    if (arr[index_r][j] == 1) {
                        count++;
                    }
                }
                if (count == col) {
                    continue;
                }
                while (true) {
                    if (index_c + 1 >= col) {
                        index_c = -1;
                    }
                    if (arr[index_r][index_c+1] == 0) {
                        index_c += 1;
                        arr[index_r][index_c] = 1;
                        break;
                    }
                    index_c += 1;
                    //arr[index_r][index_c] = 1;
                }
                //System.out.println((index_r + 1) + " " + (index_c + 1));
            }
            if (x == 3) {
                for (int j = 0; j < row; j++) {
                    if (arr[j][index_c] == 1) {
                        count++;
                    }
                }
                if (count == row) {
                    continue;
                }
                while (true) {
                    if (index_r - 1 < 0) {
                        index_r = row;
                    }
                    if (arr[index_r - 1][index_c] == 0) {
                        index_r -= 1;
                        arr[index_r][index_c] = 1;
                        break;
                    }
                    index_r -= 1;
                    //arr[index_r][index_c] = 1;
                }
                //System.out.println((index_r + 1) + " " + (index_c + 1));
            }
            if (x == 4) {
                for (int j = 0; j < row; j++) {
                    if (arr[j][index_c] == 1) {
                        count++;
                    }
                }
                if (count == row) {
                    continue;
                }
                while (true) {
                    if (index_r + 1 >= row) {
                        index_r = -1;
                    }
                    if (arr[index_r + 1][index_c] == 0) {
                        index_r += 1;
                        arr[index_r][index_c] = 1;
                        break;
                    }
                    index_r += 1;
                    //arr[index_r][index_c] = 1;
                }
                //System.out.println((index_r + 1) + " " + (index_c + 1));
            }
        }
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.println((index_r + 1) + " " + (index_c + 1));
        System.out.println(count);
        /*for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/
    }
}
