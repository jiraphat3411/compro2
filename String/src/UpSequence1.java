
import java.util.Scanner;

public class UpSequence1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = sc.next();
        int n = arr.length();
        for(int i=0;i<n;i++){
            //System.out.print(arr.charAt(i));
            if(i==n-1){
                System.out.println(arr.charAt(i));
                break;
            }
            if((int)arr.charAt(i)>=(int)arr.charAt(i+1)){
                System.out.println(arr.charAt(i));
            }
        }
    }
}
