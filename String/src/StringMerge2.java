
import java.util.Scanner;

public class StringMerge2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text_1 = sc.next();
        String text_2 = sc.next();
        int n = 0;
        if (text_1.length() < text_2.length()) {
            n = text_1.length();
        } else {
            n = text_2.length();
        }
        for (int i = 0; i < n; i++) {
            int t1 = (int)text_1.charAt(i);
            int t2 = (int)text_2.charAt(i);
            boolean A1 = 65<=t1&&t1<=90;
            boolean A2 = 65<=t2&&t2<=90;
            boolean a1 = 97<=t1&&t1<=122;
            boolean a2 = 97<=t2&&t2<=122;
            boolean n1 = 48<=t1&&t1<=57;
            boolean n2 = 48<=t2&&t2<=57;
            boolean v1 = t1==40||t1==41||t1==123||t1==125;
            boolean v2 = t2==40||t2==41||t2==123||t2==125;
            if(A1&&a2){
                System.out.print(text_1.charAt(i));
                continue;
            }
            if(A2&&a1){
                System.out.print(text_2.charAt(i));
                continue;
            }
            if(n1&&(A2||a2)){
                System.out.print(text_1.charAt(i));
                continue;
            }
            if(n2&&(A1||a1)){
                System.out.print(text_2.charAt(i));
                continue;
            }
            if(v1&&(A2||a2)){
                System.out.print(text_1.charAt(i));
                continue;
            }
            if(v2&&(A1||a1)){
                System.out.print(text_2.charAt(i));
                continue;
            }
            if(n1&&v2){
                System.out.print(text_2.charAt(i));
                continue;
            }
            if(n2&&v1){
                System.out.print(text_1.charAt(i));
                continue;
            }
            System.out.print(text_1.charAt(i));
        }
        /*40 41 123 125*/
        /*char A = '}';
        System.out.println(A+" "+(int)A);*/
    }
}
