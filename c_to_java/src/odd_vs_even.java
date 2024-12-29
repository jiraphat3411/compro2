
import java.util.Scanner;

public class odd_vs_even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum_even = 0,sum_odd = 0;
        for(int i=0;i<8;i++){
            int x = sc.nextInt();
            if(x%2==0){
                sum_even+=x;
            }else{
                sum_odd+=x;
            }
        }
        if(sum_even>sum_odd){
            System.out.println("even");
        }else if(sum_even<sum_odd){
            System.out.println("odd");
        }else{
            System.out.println("equal");
        }
        System.out.println(sum_even);
        System.out.println(sum_odd);
    }
}
