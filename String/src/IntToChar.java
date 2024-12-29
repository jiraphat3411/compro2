
import java.util.Scanner;


public class IntToChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        if(code>64&&code<91){
            System.out.println((char) code);
        }else{
            System.out.println("unsupported code");
        }
        //System.out.println((int)'Z');
    }
}
