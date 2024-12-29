
import java.util.Scanner;

public class StringCut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        String target = sc.next();
        char t = target.charAt(0);
        if (str.indexOf(t) < 0) {
            System.out.println("no target character found");
        } else {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == t) {
                    count++;
                }
            }
            if (count == n) {
                System.out.println("no output");
            } else {
                boolean Line = false;
                int c = 0;
                for (int i = 0; i < n; i++) {
                    if (str.charAt(i) == t) {
                        Line = true;
                        continue;
                    }
                    if(Line&&c==1){
                        System.out.println();
                    }
                    System.out.print(str.charAt(i));
                    c = 1;
                    Line = false;
                }
            }
            /*int count = 0;
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == t) {
                    System.out.println();
                    continue;
                }
                System.out.print(str.charAt(i));
                count++;
            }
            if (count == 0) {
                System.out.println("no output");
            } else {
                System.out.println();
            }*/
        }
    }
}
