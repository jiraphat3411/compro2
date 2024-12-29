
import java.util.Scanner;

public class WordStats1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] word = new int[26];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int index = str.charAt(0) - 65;
            word[index]++;
        }
        for (int i = 0; i < 26; i++) {
            if (word[i] > 0) {
                System.out.println((char) (i + 65) + " " + word[i]);
            }
        }
    }
}
