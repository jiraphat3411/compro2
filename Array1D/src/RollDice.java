
import java.util.Scanner;

public class RollDice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] score = new int[N];
        int[] walk = new int[N];
        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            walk[i] = sc.nextInt();
        }
        /*for(int i=0;i<N;i++){
            System.out.print(score[i]+" ");
        }
        System.out.println();
        for(int i=0;i<N;i++){
            System.out.print(walk[i]+" ");
        }
        System.out.println();*/
        int index = 0, totel_score = 0;
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            index += x;
            if (index >= N) {
                index = index - N;
            }
            if (index < 0) {
                index = N + index;
            }
            //System.out.print(index + " ");
            //
            totel_score += score[index];
            //System.out.print(totel_score + " ");
            //
            if (walk[index] == 0) {
                //System.out.print("- ");
                //System.out.println(totel_score + " ");
            } else {
                index += walk[index];
                if (index >= N) {
                    index = index - N;
                }
                if (index < 0) {
                    index = N + index;
                }
                //System.out.print(index + " ");
                totel_score += score[index];
                //System.out.println(totel_score + " ");
            }
            //
            System.out.println(index + " " + totel_score);
        }
    }
}
