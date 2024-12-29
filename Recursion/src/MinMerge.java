import java.util.Scanner;

public class MinMerge {
    String merge(String str1,String str2) {
        if(str1.length()==0){
            return str2;
        }
        if(str2.length()==0){
            return str1;
        }
        if(str1.charAt(0)<str2.charAt(0)){
            return str1.charAt(0)+ merge(str1.substring(1),str2.substring(1));
        }else{
            return str2.charAt(0)+ merge(str1.substring(1),str2.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        MinMerge merger = new MinMerge();
        System.out.print(merger.merge(str1, str2));
    }
}
