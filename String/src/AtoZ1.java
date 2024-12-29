
import java.util.Scanner;

public class AtoZ1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int n = text.length();
        int A = 0, Z = 0;
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == 65) {
                A = i;
            }
            if (text.charAt(i) == 90) {
                Z = i;
            }
        }
        if (Z < A) {
            for (int i = A; i >= Z; i--) {
                System.out.print(text.charAt(i));
            }
            System.out.println();
            return;
        }
        for (int i = A; i <= Z; i++) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }
}
