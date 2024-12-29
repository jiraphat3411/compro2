
import java.util.Scanner;

public class CharInRange2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text_1 = sc.nextLine();
        String text_2 = sc.nextLine();
        String text_3 = sc.nextLine();
        int s1=text_1.charAt(0),s2=text_2.charAt(0),s3=text_3.charAt(0);
        int e1=text_1.charAt(2),e2=text_2.charAt(2),e3=text_3.charAt(2);
        if(text_1.charAt(0)>text_1.charAt(2)){
            s1 = text_1.charAt(2);
            e1 = text_1.charAt(0);
        }
        if(text_2.charAt(0)>text_2.charAt(2)){
            s2 = text_2.charAt(2);
            e2 = text_2.charAt(0);
        }
        if(text_3.charAt(0)>text_3.charAt(2)){
            s3 = text_3.charAt(2);
            e3= text_3.charAt(0);
        }
        //
        int plus = 0,delete = 0;
        int num_plus = 0,num_delete = 0;
        String str = sc.next();
        int n = str.length();
        for(int i=0;i<n;i++){
            int count=0;
            int c = str.charAt(i);
            //boolean p = s1<=c&&c<=e1||s2<=c&&c<=e2||s3<=c&&c<=e3;
            if(s1<=c&&c<=e1){
                count++;
            }
            if(s2<=c&&c<=e2){
                count++;
            }
            if(s3<=c&&c<=e3){
                count++;
            }
            if(count==0){
                delete+=2;
                num_delete++;
            }else{
                num_plus++;
            }
            /*if(p){
                num_plus++;
            }*/
            plus+=count;
        }
        //System.out.println(plus);
        //System.out.println(delete);
        System.out.println(num_plus);
        System.out.println(num_delete);
        System.out.println(plus-delete);
    }
}
