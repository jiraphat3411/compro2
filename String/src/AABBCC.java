
import java.util.Scanner;

public class AABBCC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int count=1,max=0;
        for(int i=0;i<n-1;i++){
            int x = str.charAt(i);
            int y = str.charAt(i+1);
            boolean ABC = x==y||x+1==y;
            if(ABC){
                count++;
            }else{
                count=1;
            }
            if(count>max){
                max=count;
            }
        }
        System.out.println(max);
    }
}
