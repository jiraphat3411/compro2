
import java.util.Scanner;

public class StringExtremum2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        sc.nextLine();
        String target_1 = sc.next();
        String target_2 = sc.next();
        sc.nextLine();
        int max = 0, min = 999;
        String str = "gg";
        while (true) {
            String text = sc.nextLine();
            if (text.length() == 0) {
                break;
            }
            boolean t_1 = text.indexOf(target_1) > -1;
            boolean t_2 = text.indexOf(target_2) > -1;
            //System.out.println(text.indexOf(target_1)+" "+text.indexOf(target_2));
            if (t_1 || t_2) {
                if (target == 1) {
                    if (text.length() >= max) {
                        max = text.length();
                        str = text;
                    }
                    continue;
                }
                if (text.length() <= min) {
                    min = text.length();
                    str = text;
                }
            }
        }
        if (target == 1) {
            System.out.println(max + "\n" + str);
        } else {
            System.out.println(min + "\n" + str);
        }
    }
}
