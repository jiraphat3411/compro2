
import java.util.Scanner;

public class PPAP3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ppap = "PPAP";
        String god = "GOD";
        for(int i=0;i<str.length();){
            int pp1 = str.indexOf(ppap, i);
            int pp2 = str.indexOf(ppap, pp1+4);
            int pp3 = str.indexOf(ppap, pp2+4);
            int god1 = str.indexOf(god,pp1);
            //System.out.println(i+" "+pp1+" "+pp2+" "+pp3+" "+god1);
            if(pp1<god1&&god1<pp2||pp2<god1&&god1<pp3){
                i=str.indexOf(ppap, pp1+3);
                continue;
            }else{
                System.out.println(pp3+4);
                break;
            }
        }
    }
}
