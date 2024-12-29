
import java.util.Scanner;

public class WordStats2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] word_max = new int[26];
        int[] word_min = new int[26];
        for (int i = 0;i<26;i++) {
            word_min[i] = 999;
        }
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int Long = str.length();
            int index = str.charAt(0) - 65;
            if (Long > word_max[index]) {
                word_max[index] = Long;
            }
            if (Long < word_min[index]) {
                word_min[index] = Long;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (word_max[i] > 0&&word_min[i]>0) {
                System.out.println((char) (i + 65) + " " + word_min[i]+ " " + word_max[i]);
            }
        }
    }
}
