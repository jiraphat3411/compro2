import java.util.Scanner;

public class the_voice_su {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum_1=0,sum_2=0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(x==1){
                if(y>8&&sum_1<k){
                    sum_1++;
                    System.out.println((i+1)+" 1");
                }else if(z>8&&sum_2<k){
                    sum_2++;
                    System.out.println((i+1)+" 2");
                }
            }else{
                if(z>8&&sum_2<k){
                    sum_2++;
                    System.out.println((i+1)+" 2");
                }else if(y>8&&sum_1<k){
                    sum_1++;
                    System.out.println((i+1)+" 1");
                }
            }
        }
        //System.out.println(sum_1+sum_2);
    }
}
