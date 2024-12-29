
import java.util.Scanner;

public class CharCount2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        boolean n = true;
        int k = sc.nextInt();
        int count = 0;
        while (n) {
            String text = sc.next();
            count++;
            int m = text.length();
            for (int i = 0; i < m; i++) {
                int x = text.charAt(i) - 65;
                arr[x]++;
                if (arr[x] == k) {
                    System.out.println((char) (x + 65) + "\n" + count);
                    //return;
                    n = false;
                    break;
                }
            }
            /*for (int i = 0; i < 26; i++) {
                if (arr[i] == k) {
                    System.out.println((char) (i + 65) + "\n" + count);
                    //return;
                    n = false;
                    break;
                }
            }*/
        }
    }
}
