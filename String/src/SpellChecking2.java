
import java.util.Scanner;

public class SpellChecking2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] dic = new String[n];
        for (int i = 0; i < n; i++) {
            dic[i] = sc.next();
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String str = sc.next();
            //System.out.println(str);
            int score = 0;
            for (int j = 0; j < n; j++) {
                if (str.length() == dic[j].length()) {
                    score++;
                }
                if (str.length() > dic[j].length()) {
                    for (int k = 0; k < str.length(); k++) {
                        if (str.charAt(k) == dic[j].charAt(k)) {
                            score++;
                        }
                    }
                } else if (str.length() < dic[j].length()) {
                    for (int k = 0; k < dic[j].length(); k++) {
                        if (str.charAt(k) == dic[j].charAt(k)) {
                            score++;
                        }
                    }
                }
                System.out.print(score + " ");
                score = 0;
            }
            System.out.println();
        }
    }
}
