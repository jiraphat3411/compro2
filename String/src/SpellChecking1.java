
import java.util.Scanner;

public class SpellChecking1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] dic = new String[n];
        for (int i = 0; i < n; i++) {
            dic[i] = sc.next();
        }
        /*for(int i=0;i<n;i++){
            System.out.println(dic[i]);
        }*/
        int[] wrong = new int[10];
        for (int i = 0; i < 10; i++) {
            String str = sc.next();
            for (int j = 0; j < n; j++) {
                if (dic[j].equals(str)) {
                    wrong[i] = 1;
                }
            }
        }
        for(int i=0;i<10;i++){
            System.out.print(wrong[i]);
        }
        System.out.println();
    }
}
