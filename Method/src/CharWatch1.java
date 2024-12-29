
import java.util.Scanner;

public class CharWatch1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t1 = sc.next();String t2 = sc.next();String t3 = sc.next();
        int t_1 = (int)t1.charAt(0);int t_2 = (int)t2.charAt(0);int t_3 = (int)t3.charAt(0);
        //System.out.println(t_1+" "+t_2+" "+t_3);
        String text = sc.next();
        int long_text = text.length();
        //System.out.println("long = "+long_text);
        int c_1=0,c_2=0,c_3=0,c_4=0;
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            if(x<1||x>long_text){
                c_4++;
                continue;
            }
            int num_text = (int)text.charAt(x-1);
            //System.out.println(num_text);
            if(num_text==t_1){
                c_1++;
            }
            if(num_text==t_2){
                c_2++;
            }
            if(num_text==t_3){
                c_3++;
            }
        }
        System.out.println(c_1);
        System.out.println(c_2);
        System.out.println(c_3);
        System.out.println(c_4);
    }
}
