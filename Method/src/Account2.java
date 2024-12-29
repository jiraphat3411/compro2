
import java.util.Scanner;

public class Account2 {

    public static void main(String[] args) {
        int balance = 10000;
        Scanner sc = new Scanner(System.in);
        Account2.deposit(sc, balance);
    }

    public static void deposit(Scanner sc, int balance) {
        int money = sc.nextInt();
        System.out.println(balance+money);
    }
}
