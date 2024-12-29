
import java.util.Scanner;

public class reserve_3_vans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0,b=0,c=0;
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            if(a<=b&&a<=c){
                System.out.println("A");
                a+=x;
            }else if(b<=c){
                System.out.println("B");
                b+=x;
            }else{
                System.out.println("C");
                c+=x;
            }
        }
    }
}
