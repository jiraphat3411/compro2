
import java.util.Scanner;

public class DivideString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if(97<=(int)str.charAt(i)&&(int)str.charAt(i)<=122){
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if(65<=(int)str.charAt(i)&&(int)str.charAt(i)<=90){
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if(65<=(int)str.charAt(i)&&(int)str.charAt(i)<=90){
                continue;
            }
            if(97<=(int)str.charAt(i)&&(int)str.charAt(i)<=122){
                continue;
            }
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
