
import java.util.Scanner;

public class AtoZ2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int n = text.length();
        int[] A = new int[n];
        int[] Z = new int[n];
        int c_A = 0, c_Z = 0;
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == 65) {
                A[c_A] = i + 1;
                c_A++;
            }
            if (text.charAt(i) == 90) {
                Z[c_Z] = i + 1;
                c_Z++;
            }
        }
        /*System.out.println(c_A + " " + c_Z);
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(Z[i] + " ");
        }
        System.out.println();*/
        //
        //int index_A = 0, index_Z = 0;
        int temp = 0, near = 999;
        for (int i = 0; i < c_A; i++) {
            for (int j = 0; j < c_Z; j++) {
                if (A[i] > Z[j]) {
                    temp = A[i] - Z[j];
                } else {
                    temp = Z[j] - A[i];
                }
                if (temp < near) {
                    near = temp;
                    //index_A = i;
                    //index_Z = j;
                }
            }
        }
        //System.out.println(index_A+" "+near+" "+index_Z);
        System.out.println(near+1);
    }
}
