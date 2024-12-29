
import java.util.Scanner;

class Account {

    String name;
    String code;
    double balaean;
    boolean active;

    Account(String name, String code, double balaean) {
        this.name = name;
        this.code = code;
        this.balaean = balaean;
        this.active = true;
        System.out.println("Open account");
    }

    void printInfo() {
        System.out.print(name + ", " + code + ", " + balaean);
        if (active) {
            System.out.println(", active");
        } else {
            System.out.println(", inactive");
        }
    }

    double checkBalance() {
        return balaean;
    }

    void closeAccount() {
        this.active = false;
        printInfo();
    }

    boolean deposit(double money) {
        if (active) {
            this.balaean += money;
            System.out.print(balaean + " ");
            return true;
        }
        return false;
    }

    boolean withdrawn(double money) {
        if (money <= balaean && active) {
            this.balaean -= money;
            System.out.print(balaean + " ");
            return true;
        }
        return false;
    }
}

class Saving extends Account {

    String id;
    String tel;
    boolean promptPay;

    Saving(String name, String code, double balaean) {
        super(name, code, balaean);
        this.promptPay = false;
        this.id = null;
        this.tel = null;
        System.out.println("Saving account");
    }

    @Override
    void printInfo() {
        super.printInfo();
        if (this.promptPay) {
            System.out.print("PromptPay, ");
            if (id != null && tel != null) {
                System.out.println(id + ", " + tel);
            } else if (id == null) {
                System.out.println(tel);
            } else if (tel == null) {
                System.out.println(id);
            }
            //System.out.println(id+", "+tel);
        } else {
            System.out.println("no PromptPay");
        }
    }

    boolean openPromptPay(int num, String d_t) {
        boolean b = false;
        if (num == 1) {
            if (d_t.length() == 13) {
                this.id = d_t;
                promptPay = true;
                b = true;
            }
        } else {
            if (d_t.length() == 10) {
                this.tel = d_t;
                promptPay = true;
                b = true;
            }
        }
        return b;
    }
}

class FixedDeposit extends Account {

    double fixedAmount;

    FixedDeposit(String name, String code, double balaean, double fixedAmount) {
        super(name, code, balaean);
        this.fixedAmount = fixedAmount;
        System.out.println("FixedDeposit account with " + fixedAmount);
    }

    @Override
    boolean deposit(double money) {
        boolean b = false;
        if (money>=this.fixedAmount) {
            b = super.deposit(money);
        } else {
            System.out.print("deposit less than " + fixedAmount+" ");
        }
        return b;
    }
}

class CurrenAccount extends Account {

    double overDraft;

    CurrenAccount(String name, String code, double balaean, double overDraft) {
        super(name, code, balaean);
        this.overDraft = overDraft * -1;
        System.out.println("Current account with overdraft " + overDraft);
    }

    @Override
    boolean withdrawn(double money) {
        if (balaean - money >= overDraft && active) {
            this.balaean -= money;
            System.out.print(balaean + " ");
            if (balaean < 0) {
                System.out.print("overdraft ");
            }
            return true;
        }
        return false;
    }
}

public class BankAccount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Saving sAcc = null;
        FixedDeposit fAcc = null;
        CurrenAccount cAcc = null;
        for (int i = 0; i < 3; i++) {
            String name = sc.nextLine();
            String code = sc.nextLine();
            double balaean = sc.nextDouble();
            if (i == 0) {
                sc.nextLine();
                sAcc = new Saving(name, code, balaean);
            } else if (i == 1) {
                double fixedAmount = sc.nextDouble();
                sc.nextLine();
                fAcc = new FixedDeposit(name, code, balaean, fixedAmount);
            } else if (i == 2) {
                double overDraft = sc.nextDouble();
                sc.nextLine();
                cAcc = new CurrenAccount(name, code, balaean, overDraft);
            }
        }
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int acc = sc.nextInt();
            int num = sc.nextInt();
            if (acc == 1) {
                if (num == 1) {
                    sAcc.printInfo();
                } else if (num == 2) {
                    System.out.println(sAcc.checkBalance());
                } else if (num == 3) {
                    sAcc.closeAccount();
                } else if (num == 4) {
                    double money = sc.nextDouble();
                    boolean b = sAcc.deposit(money);
                    System.out.println(b);
                } else if (num == 5) {
                    double money = sc.nextDouble();
                    boolean b = sAcc.withdrawn(money);
                    System.out.println(b);
                } else if (num == 6) {
                    int number = sc.nextInt();
                    String d_t = sc.next();
                    boolean b = sAcc.openPromptPay(number, d_t);
                    System.out.println(b);
                }
            } else if (acc == 2) {
                if (num == 1) {
                    fAcc.printInfo();
                } else if (num == 2) {
                    System.out.println(fAcc.checkBalance());
                } else if (num == 3) {
                    fAcc.closeAccount();
                } else if (num == 4) {
                    double money = sc.nextDouble();
                    boolean b = fAcc.deposit(money);
                    System.out.println(b);
                } else if (num == 5) {
                    double money = sc.nextDouble();
                    boolean b = fAcc.withdrawn(money);
                    System.out.println(b);
                }
            } else if (acc == 3) {
                if (num == 1) {
                    cAcc.printInfo();
                } else if (num == 2) {
                    System.out.println(cAcc.checkBalance());
                } else if (num == 3) {
                    cAcc.closeAccount();
                } else if (num == 4) {
                    double money = sc.nextDouble();
                    boolean b = cAcc.deposit(money);
                    System.out.println(b);
                } else if (num == 5) {
                    double money = sc.nextDouble();
                    boolean b = cAcc.withdrawn(money);
                    System.out.println(b);
                }
            }
        }
    }
}
/*
Harry Potter
001-1200
500
Hermione Granger
002-1100
500 1000.0
Ron Weasley
003-1111
500 1500.00
7
1 1
2 4 500.00
2 4 1000.00
2 1
3 5 500
3 5 1500
3 1
 */
