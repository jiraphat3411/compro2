
import java.util.Scanner;

public class how_to_break {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            int x = sc.nextInt();
            if (x == 0) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}