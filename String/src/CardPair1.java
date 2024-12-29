
import java.util.Scanner;

public class CardPair1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String str_1 = sc.next();
            String str_2 = sc.next();
            int s_1 = str_1.charAt(0);
            if (s_1 > str_1.charAt(1)) {
                s_1 = str_1.charAt(1);
            }
            int s_2 = str_2.charAt(0);
            if (s_2 > str_2.charAt(1)) {
                s_2 = str_2.charAt(1);
            }
            //System.out.println(s_1+" "+s_2);
            if (s_1 < s_2) {
                System.out.print("W");
            } else if (s_1 > s_2) {
                System.out.print("L");
            } else {
                System.out.print("D");
            }
        }

    }
}
