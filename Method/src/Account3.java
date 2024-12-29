
import java.util.Scanner;

public class Account3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int money = sc.nextInt();
        int count = Account3.deposit(money);
        if(count==-1){
            System.out.println("Error");
            return;
        }
        System.out.println(balance+money);
    }

    public static int deposit(int money) {
        if(money<=0){
            return -1;
        }
        return 0;
    }
}
