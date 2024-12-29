
import java.util.Scanner;

public class LongestCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String[] str = new String[100];
        int count = 0,count_1=0;
        for (int i = 0;; i++) {
            str[i] = sc.nextLine();
            count++;
            if (str[i].length() == 0) {
                break;
            }
            if (str[i].length() > max) {
                max = str[i].length();  
            }
        }
        for (int i = 0;i<count; i++) {
            //System.out.println(str[i]);
            if(str[i].length()==max){
                count_1++;
            }
        }
        System.out.println(max+"\n"+count_1);
    }
}
