
import java.util.Scanner;

public class StringExtremum1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        sc.nextLine();
        int max = 0, min = 999;
        String str = "gg";
        boolean n = true;
        while (n) {
            String text = sc.nextLine();
            if (text.length() == 0) {
                break;
            }
            //System.out.println(text+" "+text.length());
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
        if(target==1){
            System.out.println(max+"\n"+str);
        }else{
            System.out.println(min+"\n"+str);
        }
    }
}
