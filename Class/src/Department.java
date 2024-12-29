
import java.util.Scanner;

class Dept {

    int ministryBudget;
    int eduFee;
    int serviceFee;
    int donation;
    int salary;
    int elec;
    int eduCost;

    public Dept(int personnel, int student) {
        int income = this.computeIncome(personnel, student);
        int expense = this.computeExpense(personnel, student);
        System.out.println("total income = " + income);
        System.out.println("total expense = " + expense);
        System.out.println("income - expense = " + (income-expense));
    }

    int computeIncome(int personnel, int student) {
        this.ministryBudget = personnel * 500000 + student * 3000;
        this.eduFee = student * 5000;
        this.serviceFee = 300000;
        this.donation = 100000;
        int income = ministryBudget + eduFee + serviceFee + donation;
        return income;
    }

    int computeExpense(int personnel, int student) {
        this.salary = personnel*600000;
        this.elec = (personnel+student)*2000;
        this.eduCost = student*4000;
        int expense = salary+elec+eduCost;
        return expense;
    }

    void printReport() {
        System.out.println("ministry budget = " + ministryBudget);
        System.out.println("education fee = " + eduFee);
        System.out.println("service fee = " + serviceFee);
        System.out.println("donation = " + donation);
        System.out.println("salary = " + salary);
        System.out.println("electricity = " + elec);
        System.out.println("educational cost = " + eduCost);
    }
}

public class Department {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int personnel = sc.nextInt();
        int student = sc.nextInt();
        Dept dept = new Dept(personnel, student);
        dept.printReport();
    }
}
