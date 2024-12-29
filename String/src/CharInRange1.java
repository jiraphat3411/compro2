
import java.util.Scanner;

public class CharInRange1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text_1 = sc.nextLine();
        //System.out.println((int)text_1.charAt(0)+" "+(int)text_1.charAt(2));
        String text_2 = sc.nextLine();
        //System.out.println((int)text_2.charAt(0)+" "+(int)text_2.charAt(2));
        String text_3 = sc.nextLine();
        //System.out.println((int)text_3.charAt(0)+" "+(int)text_3.charAt(2));
        /*String char_1 = sc.next();
        String char_2 = sc.next();
        String char_3 = sc.next();*/
        /*System.out.println(text_1);
        System.out.println(text_2);
        System.out.println(text_3);
        System.out.println(char_1);
        System.out.println(char_2);
        System.out.println(char_3);*/
        //
        int s1=text_1.charAt(0),s2=text_2.charAt(0),s3=text_3.charAt(0);
        int e1=text_1.charAt(2),e2=text_2.charAt(2),e3=text_3.charAt(2);
        if(text_1.charAt(0)>text_1.charAt(2)){
            s1 = text_1.charAt(2);
            e1 = text_1.charAt(0);
        }
        //System.out.println(s1+" "+e1);
        if(text_2.charAt(0)>text_2.charAt(2)){
            s2 = text_2.charAt(2);
            e2 = text_2.charAt(0);
        }
        //System.out.println(s2+" "+e2);
        if(text_3.charAt(0)>text_3.charAt(2)){
            s3 = text_3.charAt(2);
            e3= text_3.charAt(0);
        }
        //System.out.println(s3+" "+e3);
        //
        for(int i=0;i<3;i++){
            int count=0;
            String ch_ar = sc.next();
            int c = ch_ar.charAt(0);
            if(s1<=c&&c<=e1){
                System.out.print("1 ");
                count++;
            }
            if(s2<=c&&c<=e2){
                System.out.print("2 ");
                count++;
            }
            if(s3<=c&&c<=e3){
                System.out.print("3 ");
                count++;
            }
            if(count==0){
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
