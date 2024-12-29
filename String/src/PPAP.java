
import java.util.Scanner;

public class PPAP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ppap = "PPAP";
        String god = "GOD";
        if(str.indexOf(ppap)==-1){
            System.out.println("clean");
            //System.out.println(str.indexOf(ppap));
        }else{
            //System.out.println(str.indexOf(ppap));
            if(str.indexOf(god)<str.indexOf(ppap)&&str.lastIndexOf(god)>str.lastIndexOf(ppap)){
                System.out.println("safe");
            }else{
                System.out.println("danger");
            }
        }
        /*System.out.println(str.indexOf(ppap));
        System.out.println(str.lastIndexOf(ppap));
        System.out.println(str.indexOf(god));
        System.out.println(str.lastIndexOf(god));*/
    }
}
