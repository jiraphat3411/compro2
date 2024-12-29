
import java.util.Scanner;

public class CountBetween1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        int count = 0, count_x = 0, count_y = 0;
        for (int i = 0; i < n; i++) {
            if(x1<=arr[i]&&arr[i]<=x2){
                count_x++;
                continue;
            }
            if(y1<=arr[i]&&arr[i]<=y2){
                count_y++;
                continue;
            }
            count++;
        }
        System.out.println(count_x);
        System.out.println(count_y);
        System.out.println(count);
    }
}
