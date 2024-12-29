import java.util.Scanner;

public class indexOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str_1 = sc.next();
        if(str.indexOf(str_1)<0){
            System.out.println("string not found");
        }else{
            //System.out.print(str.indexOf(str_1)+1+" ");
            for(int i=0;i<str.length();i++){
                if(str.indexOf(str_1,i)<0){
                    break;
                }
                System.out.print(str.indexOf(str_1,i)+1+" ");
                i=str.indexOf(str_1,i);
            }
        }
    }
}
