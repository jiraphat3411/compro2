
import java.util.Scanner;

public class KeepTwo {

    String keepTwo(String str) {
        if(str.length()<=1){
            return str;
        }
        char c = str.charAt(0);
        String sub = str.substring(1);
        int n2 = sub.indexOf(c);
        int n3 = sub.lastIndexOf(c);
        while(n2!=n3){
            sub = sub.substring(0, n3)+sub.substring(n3+1);
            //System.out.println(sub);
            n2 = sub.indexOf(c);
            n3 = sub.lastIndexOf(c);
        }
        return c + keepTwo(sub);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        KeepTwo kt = new KeepTwo();
        String answer = kt.keepTwo(str);
        System.out.println(answer);
        //System.out.println(str.lastIndexOf("A"));
        //char a = 'A';
        //System.out.println((int)a);
        //System.out.println(str.substring(1));
        //System.out.println( str.indexOf(str.charAt(0), str.indexOf(str.charAt(0),0)+1) );
        
    }
}
