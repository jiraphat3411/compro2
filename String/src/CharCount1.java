
import java.util.Scanner;

public class CharCount1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int[] arr = new int[26];
        int n = text.length();
        for(int i=0;i<n;i++){
            int x = text.charAt(i)-65;
            arr[x]++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                System.out.println((char)(i+65)+" "+arr[i]);
            }
        }
    }
}
