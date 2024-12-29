
import java.util.Scanner;

public class KeyWord1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String words[] = new String[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            boolean dup = false;
            for (int j = 0; j < count + 1; j++) {
                dup = str.equalsIgnoreCase(words[j]);
                if (dup) {
                    break;
                }
            }
            if (dup) {
                continue;
            }
            words[count] = str;
            count++;
            //System.out.print(str+" ");
            //System.out.print(count+" ");
        }
        for (int i = 0; i < count; i++) {
            System.out.print(words[i]+" ");
        }
        System.out.println();
    }
}
