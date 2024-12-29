
import java.util.Scanner;

public class CardPair2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String str_1 = sc.next();
            String str_2 = sc.next();
            boolean s1 = str_1.charAt(0)==str_1.charAt(1);
            boolean s2 = str_2.charAt(0)==str_2.charAt(1);
            if(s1&&!s2){
                System.out.print("W");
                continue;
            }
            if(!s1&&s2){
                System.out.print("L");
                continue;
            }
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
