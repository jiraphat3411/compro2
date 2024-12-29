
import java.util.Scanner;

public class UnderLineWithparameter {

    public static void UnderLine(int m) {
        for (int j = 0; j < m; j++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int m =sc.nextInt();
            System.out.println(str);
            /*for(int j=0;j<20;j++){
                System.out.print("-");
            }
            System.out.println();*/
            UnderLineWithparameter.UnderLine(m);
        }
    }
}