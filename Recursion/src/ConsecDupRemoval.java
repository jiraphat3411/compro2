
import java.util.Scanner;

public class ConsecDupRemoval {

    String dupRemove(String str) {
        if (str.length() == 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return dupRemove(str.substring(1, str.length()));
        } else {
            return str.charAt(0) + dupRemove(str.substring(1, str.length()));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = (new ConsecDupRemoval()).dupRemove(str);
        System.out.print(result);
    }
}
