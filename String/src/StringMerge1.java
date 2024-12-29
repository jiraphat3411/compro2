
import java.util.Scanner;

public class StringMerge1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text_1 = sc.next();
        String text_2 = sc.next();
        int num = sc.nextInt();
        int n = 0;
        if (text_1.length() < text_2.length()) {
            n = text_1.length();
        } else {
            n = text_2.length();
        }
        //System.out.println(n);
        for (int i = 0; i < n; i++) {
            boolean t1 = 65<=(int)text_1.charAt(i)&&(int)text_1.charAt(i)<=90;
            boolean t2 = 97<=(int)text_2.charAt(i)&&(int)text_2.charAt(i)<=122;
            if(t1&&t2){
                System.out.print(text_1.charAt(i));
                continue;
            }
            if(!t1&&!t2){
                System.out.print(text_2.charAt(i));
                continue;
            }
            if(num==1){
                System.out.print(text_1.charAt(i));
                continue;
            }
            if(num==2){
                System.out.print(text_2.charAt(i));
                continue;
            }
        }
    }
}
