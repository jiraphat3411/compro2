import java.util.Scanner;

public class Crypto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int index = sc.nextInt();
        int key = sc.nextInt();
        boolean re_1=false,re_2=false;
        if(arr[index]+key<=51743||arr[index+1]-key>7832){
            re_1=true;
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        if(arr[index+2]-key<2394||arr[index+3]+key>9213){
            re_2=true;
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        if(re_1&&re_2){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }
}