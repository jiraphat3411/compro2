
import java.util.Scanner;

public class AlternateJump {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr_1 = new int[n];
        for(int i =0;i<n;i++){
            arr_1[i] = sc.nextInt();
        }
        int[] arr_2 = new int[n];
        for(int i =0;i<n;i++){
            arr_2[i] = sc.nextInt();
        }
        int index_1=0,index_2=0;
        int count_1=0,count_2=0;
        boolean temp = true;
        while(index_1<n&&index_2<n){
            if(temp){
                if(arr_1[index_1]%2==0){
                    System.out.println("1 "+(index_1+1)+" "+arr_1[index_1]);
                    index_1+=arr_1[index_1];
                    count_1++;
                }else{
                    System.out.println("1 "+(index_1+1)+" "+arr_1[index_1]);
                    index_2+=arr_1[index_1];
                    temp=false;
                    count_1++;
                }
            }else{
                if(arr_2[index_2]%2==0){
                    System.out.println("2 "+(index_2+1)+" "+arr_2[index_2]);
                    index_2+=arr_2[index_2];
                    count_2++;
                }else{
                    System.out.println("2 "+(index_2+1)+" "+arr_2[index_2]);
                    index_1+=arr_2[index_2];
                    temp=true;
                    count_2++;
                }
            }
        }
        System.out.println(count_1+"\n"+count_2);
    }
}
