import java.util.Scanner;

public class SubMatch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String target = sc.next();
        int n = str.length();
        int m = target.length();
        //System.out.println(n+" "+m);
        int[] count = new int[m-2];
        int[] result = new int[m-2];
        for(int i=0;i<n-2;i++){
            for(int j=0;j<m-2;j++){
                if(str.charAt(i)==target.charAt(j)&&str.charAt(i+1)==target.charAt(j+1)&&str.charAt(i+2)==target.charAt(j+2)){
                    if(count[j]==0){
                        result[j]=i+1;
                    }
                    count[j]++;
                }
            }
        }
        for(int i=0;i<m-2;i++){
            if(count[i]==0){
                System.out.println("No");
                continue;
            }
            System.out.println(result[i]);
        }
        /*char t1 = target.charAt(0);
        char t2 = target.charAt(1);
        char t3 = target.charAt(2);
        char t4 = target.charAt(3);
        char t5 = target.charAt(4);
        //System.out.println(t1+" "+t2+" "+t3+" "+t4+" "+t5);
        int r1 = 0,r2 = 0,r3 = 0;
        int c1 = 0,c2 = 0,c3 = 0;*/
        /*for(int i=0;i<n-2;i++){
            //System.out.println(str.charAt(i)+" "+str.charAt(i+1)+" "+str.charAt(i+2));
            if(str.charAt(i)==t1&&str.charAt(i+1)==t2&&str.charAt(i+2)==t3){
                if(c1==0){
                    r1 = i+1;
                }
                c1++;
                //System.out.println("1 "+t1+" "+t2+" "+t3);
                continue;
            }
            if(str.charAt(i)==t2&&str.charAt(i+1)==t3&&str.charAt(i+2)==t4){
                if(c2==0){
                    r2 = i+1;
                }
                c2++;
                //System.out.println("2 "+t2+" "+t3+" "+t4);
                continue;
            }
            if(str.charAt(i)==t3&&str.charAt(i+1)==t4&&str.charAt(i+2)==t5){
                if(c3==0){
                    r3 = i+1;
                }
                c3++;
                //System.out.println("3 "+t3+" "+t4+" "+t5);
                continue;
            }
            if(c1>0&&c2>0&&c3>0){
                break;
            }
        }*/
        /*if(r1==0){
            System.out.println("No");
        }else{
            System.out.println(r1);
        }
        if(r2==0){
            System.out.println("No");
        }else{
            System.out.println(r2);
        }
        if(r3==0){
            System.out.println("No");
        }else{
            System.out.println(r3);
        }*/
    }
}
