
import java.util.Scanner;

public class indexOf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str_1 = sc.nextLine();
        if (str.indexOf(str_1) < 0) {
            System.out.println("string not found");
        } else {
            System.out.println(str.indexOf(str_1) + 1);
        }
    }
}
