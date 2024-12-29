
import java.util.Scanner;

public class CharCode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char c = text.charAt(0);
        int valC = (int) c;
        System.out.println(valC);
    }
}
