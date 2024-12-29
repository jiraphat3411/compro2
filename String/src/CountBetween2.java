
import java.util.Scanner;

public class CountBetween2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int count = 0, count_A = 0, count_a = 0;
        for (int i = 0; i < n; i++) {
            if(65<=(int)str.charAt(i)&&(int)str.charAt(i)<=90){
                count_A++;
                continue;
            }
            if(97<=(int)str.charAt(i)&&(int)str.charAt(i)<=122){
                count_a++;
                continue;
            }
            count++;
        }
        System.out.println(count_a);
        System.out.println(count_A);
        System.out.println(count);
        /*char A = 'z';
        System.out.println((int)A);*/
    }
}
