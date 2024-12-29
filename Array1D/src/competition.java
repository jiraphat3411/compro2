import java.util.Scanner;

public class competition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr_1 = new int[n];
        for(int i=0;i<n;i++){
            arr_1[i]=sc.nextInt();
        }
        int[] arr_2 = new int[n];
        for(int i=0;i<n;i++){
            arr_2[i]=sc.nextInt();
        }
        int sum_1=0,sum_2=0;
        for(int i=0;i<n;i++){
            if(arr_1[i]>arr_2[i]){
                sum_1+=2;
            }else if(arr_1[i]==arr_2[i]){
                sum_1++;
                sum_2++;
            }else{
                sum_2+=2;
            }
        }
        if(sum_1>sum_2){
            System.out.println("Team 1 wins");
            System.out.println("Score "+sum_1+" to "+sum_2);
        }else if(sum_1<sum_2){
            System.out.println("Team 2 wins");
            System.out.println("Score "+sum_2+" to "+sum_1);
        }else{
            System.out.println("Draw game");
            System.out.println("Score "+sum_1+" to "+sum_2);
        }
    }
}
