
import java.util.Scanner;

public class KeyWord2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String words[] = new String[n];
        int arr[] = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            boolean dup = false;
            for (int j = 0; j < count + 1; j++) {
                dup = str.equalsIgnoreCase(words[j]);
                if (dup) {
                    arr[j]++;
                    break;
                }
            }
            if (dup) {
                continue;
            }
            words[count] = str;
            count++;
        }
        for (int i = 0; i < count; i++) {
            System.out.print(words[i]+" ");
        }
        System.out.println();
        int max = 0;
        for (int i = 0; i < count; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print((max+1)+" ");
        for (int i = 0; i < count; i++) {
            if(arr[i]==max){
                System.out.print(words[i]+" ");
            }
        }
    }
}
