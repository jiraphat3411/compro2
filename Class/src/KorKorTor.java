
import java.util.Scanner;

class Party {

    String Partyname;
    int number;
    Scanner sc;
    String[] name;
    String[] surname;
    int[] county;

    Party(String Partyname, int number, Scanner sc) {
        this.Partyname = Partyname;
        this.number = number;
        this.name = new String[number];
        this.surname = new String[number];
        this.county = new int[number];
        for (int i = 0; i < number; i++) {
            this.name[i] = sc.next();
            this.surname[i] = sc.next();
            this.county[i] = sc.nextInt();
        }
    }

    void printInfo(int county) {
        if (county < 0) {
            System.out.println("invalid region number");
        }
        if (county == 0) {
            for (int i = 0; i < number; i++) {
                System.out.println(this.name[i] + " " + this.surname[i] + " " + this.county[i]);
            }
        }
        if (county > 0) {
            boolean b = true;
            for (int i = 0; i < number; i++) {
                if (county == this.county[i]) {
                    System.out.println(this.name[i] + " " + this.surname[i]);
                    b = false;
                }
            }
            if (b) {
                System.out.println("none");
            }
        }
    }

    /*void printInfo() {
        for (int i = 0; i < number; i++) {
            System.out.println(this.name[i] + " " + this.surname[i] + " " + this.county[i]);
        }
    }*/
}

class Precinct {
    String party;
    String[] partyname;
    int[] score;
    Precinct(String party,String[] partyname){
        this.party = party;
        this.partyname = partyname;
        this.score = new int[partyname.length];
    }
    void count(int num){
        boolean b = num<1||num>partyname.length;
        //System.out.println(num+" "+partyname.length+" "+b);
        if(b){
            System.out.println("invalid number");
        }else{
            score[num-1]++;
            System.out.println(partyname[num-1]+" "+score[num-1]);
        }
    }
    void printInfo(){
        for(int i=0;i<partyname.length;i++){
            System.out.println((i+1)+" "+partyname[i]+" "+score[i]);
        }
    }
    void printMax(){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<partyname.length;i++){
            if(score[i]>max){
                max = score[i];
            }
        }
        for(int i=0;i<partyname.length;i++){
            if(score[i]==max){
                System.out.println((i+1)+" "+partyname[i]+" "+score[i]);
            }
        }
    }
}

public class KorKorTor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int n = sc.nextInt();
        Party[] party = new Party[n];
        String name[] = new String[n];
        int number[] = new int[n];
        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            number[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            party[i] = new Party(name[i], number[i], sc);
        }
        final int K = sc.nextInt();
        for (int i = 0; i < K; ++i) {
            int partyNumber = sc.nextInt();
            int regionNumber = sc.nextInt();
            party[partyNumber - 1].printInfo(regionNumber);
        }
        /*for (int i = 0; i < n; i++) {
            party[i].printInfo();
        }*/
        String party = sc.next();
        int n = sc.nextInt();
        String[] partyname = new String[n];
        for(int i=0;i<n;i++){
            partyname[i] = sc.next();
        }
        Precinct pre = new Precinct(party,partyname);
        final int K = sc.nextInt();
        for (int i = 0; i < K; ++i) {
            int x = sc.nextInt();
            if(x==1){
                int y = sc.nextInt();
                pre.count(y);
            }else if(x==2){
                pre.printInfo();
            }else if(x==3){
                pre.printMax();
            }
        }
    }
}
