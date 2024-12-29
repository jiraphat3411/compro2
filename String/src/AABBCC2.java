
import java.util.Scanner;

public class AABBCC2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int count=1,max=0;
        int index_e=0;
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
                index_e=i+1;
            }
        }
        System.out.println(max);
        if(max==1){
            System.out.println(str.charAt(0));
            return;
        }
        int index_s=index_e-(max-1);
        for(int i = index_s;i<=index_e;i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
