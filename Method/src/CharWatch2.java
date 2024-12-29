
import java.util.Scanner;

public class CharWatch2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t1 = sc.next();
        String t2 = sc.next();
        String t3 = sc.next();
        int t_1 = (int) t1.charAt(0);
        int t_2 = (int) t2.charAt(0);
        int t_3 = (int) t3.charAt(0);
        //
        int n = sc.nextInt();
        String[] text = new String[n];
        for (int i = 0; i < n; i++) {
            text[i] = sc.next();
        }
        //
        int c_1 = 0, c_2 = 0, c_3 = 0;
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            for (int j = 0; j < n; j++) {
                int long_text = text[j].length();
                if (x < 1 || x > long_text) {
                    continue;
                }
                int num_text = (int) text[j].charAt(x - 1);
                if (num_text == t_1) {
                    c_1++;
                }
                if (num_text == t_2) {
                    c_2++;
                }
                if (num_text == t_3) {
                    c_3++;
                }
            }
        }
        System.out.println(c_1);
        System.out.println(c_2);
        System.out.println(c_3);
    }
}
