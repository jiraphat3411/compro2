
import java.util.Scanner;

public class Account1 {

    public static void main(String[] args) {
        int balance = 10000;
        Scanner sc = new Scanner(System.in);
        int new_balance = Account1.deposit(sc, balance);
        System.out.println(new_balance);
    }

    public static int deposit(Scanner sc, int balance) {
        int money = sc.nextInt();
        //System.out.println(balance+money);
        return balance+money;
    }
}
