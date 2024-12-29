
import java.util.Scanner;

public class ABC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int count=0;
        for(int i=0;i<n-2;i++){
            int x = str.charAt(i);
            int y = str.charAt(i+1);
            int z = str.charAt(i+2);
            boolean ABC = x+1==y&&y+1==z;
            if(ABC){
                count++;
            }
        }
        System.out.println(count);
    }
}
