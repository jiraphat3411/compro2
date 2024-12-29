import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int index = sc.nextInt();
        if(index<=str.length()&&index>0){
            System.out.println(str.charAt(index-1));
        }else{
            System.out.println("invalid position");
        }
    }
}
