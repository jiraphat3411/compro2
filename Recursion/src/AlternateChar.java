
import java.util.Scanner;

public class AlternateChar {

    String alterMerge(String s1, String s2, int order){
        if(s1.length()==0||s2.length()==0){
            return "";
        }
        if(order%2!=0){
            order++;
            return s1.charAt(0)+alterMerge(s1.substring(1), s2.substring(1), order);
        }else if(order%2==0){
            order++;
            return s2.charAt(0)+alterMerge(s1.substring(1), s2.substring(1), order);
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int order = sc.nextInt();
        AlternateChar ac = new AlternateChar();
        String ans = ac.alterMerge(s1, s2, order);
        System.out.println(ans);
    }
}
