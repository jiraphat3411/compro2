
import java.util.Scanner;

public class UnderLine1 {

    public static void UnderLine() {
        for (int j = 0; j < 20; j++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            System.out.println(str);
            /*for(int j=0;j<20;j++){
                System.out.print("-");
            }
            System.out.println();*/
            UnderLine1.UnderLine();
        }
    }
}
