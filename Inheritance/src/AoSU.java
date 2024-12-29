
import java.util.Scanner;

class Hero {

    String name;
    int hp;
    int att_phy;
    int att_magic;
    int def_phy;
    int def_magic;

    Hero(String name, int hp, int type, int att, int def_phy, int def_magic) {
        boolean b = hp < 0 || type < 0 || att < 0 || def_phy < 0 || def_magic < 0;
        if (b) {
            System.out.println("warning: value cannot be negative");
        }
        this.name = name;
        this.hp = hp;
        if (type == 1) {
            this.att_phy = att;
            this.att_magic = 0;
        } else {
            this.att_phy = 0;
            this.att_magic = att;
        }
        this.def_phy = def_phy;
        this.def_magic = def_magic;
    }

    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        System.out.print("Attack: ");
        if (att_magic == 0) {
            System.out.println(att_phy + " (physical)");
        } else {
            System.out.println(att_magic + " (magical)");
        }
        System.out.println("Defense: " + def_phy + " (physical), " + def_magic + " (magical)");
        this.checKAndWarn();
    }

    boolean checKAndWarn() {
        boolean b = hp < 0 || att_phy < 0 || att_magic < 0 || def_phy < 0 || def_magic < 0;
        if (b) {
            System.out.println("warning: value cannot be negative");
        }
        return !b;
    }
}

class Team {

    Hero[] members;

    Team(Hero[] members) {
        if (this.is5MemberTeam(members)) {
            if (this.isValid(members)) {
                this.members = members;
                this.isBalanced(members);
            }
        }
    }

    boolean is5MemberTeam(Hero[] members) {
        boolean b = false;
        if (members.length < 5) {
            System.out.println("member is missing");
        } else if (members.length == 5) {
            System.out.println("full team");
            b = true;
        } else {
            System.out.println("too many members");
        }
        return b;
    }

    boolean isValid(Hero[] members) {
        boolean b = true;
        if (members.length == 5) {
            for (int i = 0; i < 5; i++) {
                for (int j = i + 1; j < 5; j++) {
                    if (members[i].name.equals(members[j].name)) {
                        b = false;
                        System.out.println("cannot select same hero: " + members[i].name);
                        break;
                    }
                }
                /*if (!b) {
                    break;
                }*/
            }
        } else {
            b = false;
        }
        if (b) {
            System.out.println("valid hero selection");
        }
        return b;
    }

    boolean isBalanced(Hero[] members) {
        boolean b = false;
        if (members.length == 5) {
            int cc = 0, cf = 0, cm = 0, ct = 0;
            for (int i = 0; i < 5; i++) {
                if (members[i] instanceof Carry) {
                    cc++;
                }else if (members[i] instanceof Fighter) {
                    cf++;
                }else if (members[i] instanceof Mage) {
                    cm++;
                }else if (members[i] instanceof Tank) {
                    ct++;
                }
            }
            //System.out.println(cc+ " "+ cf + " "+ cm + " "+ ct);
            if(cc!=0&&cf!=0&&cm!=0&&ct!=0){
                b = true;
                System.out.println("balanced team");
            }else{
                System.out.print("team needs");
                if(cc==0){
                    System.out.print(" carry");
                }
                if(cf==0){
                    System.out.print(" fighter");
                }
                if(cm==0){
                    System.out.print(" mage");
                }
                if(ct==0){
                    System.out.print(" tank");
                }
                System.out.println();
            }
        }
        return b;
    }
}

class Carry extends Hero {

    Carry(String name, int hp, int type, int att, int def_phy, int def_magic) {
        super(name, hp, type, att, def_phy, def_magic);
    }
}

class Fighter extends Hero {

    Fighter(String name, int hp, int type, int att, int def_phy, int def_magic) {
        super(name, hp, type, att, def_phy, def_magic);
    }
}

class Mage extends Hero {

    Mage(String name, int hp, int type, int att, int def_phy, int def_magic) {
        super(name, hp, type, att, def_phy, def_magic);
    }
}

class Tank extends Hero {

    Tank(String name, int hp, int type, int att, int def_phy, int def_magic) {
        super(name, hp, type, att, def_phy, def_magic);
    }
}

class Support extends Hero {

    Support(String name, int hp, int type, int att, int def_phy, int def_magic) {
        super(name, hp, type, att, def_phy, def_magic);
    }
}

class Assassin extends Hero {

    Assassin(String name, int hp, int type, int att, int def_phy, int def_magic) {
        super(name, hp, type, att, def_phy, def_magic);
    }
}

public class AoSU {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*String name = sc.next();
        int hp = sc.nextInt();
        int type = sc.nextInt();
        int att = sc.nextInt();
        int def_phy = sc.nextInt();
        int def_magic = sc.nextInt();
        Hero hero = new Hero(name, hp, type, att, def_phy, def_magic);
        hero.printInfo();
        System.out.println(hero.checKAndWarn());*/
        /*int n = sc.nextInt();
        Hero[] members = new Hero[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int hp = sc.nextInt();
            int type = sc.nextInt();
            int att = sc.nextInt();
            int def_phy = sc.nextInt();
            int def_magic = sc.nextInt();
            members[i] = new Hero(name, hp, type, att, def_phy, def_magic);
        }
        Team t = new Team(members);
        System.out.println(t.is5MemberTeam(members));
        System.out.println(t.isValid(members));*/
        int n = sc.nextInt();
        Hero[] members = new Hero[n];
        for (int i = 0; i < n; i++) {
            int tp = sc.nextInt();
            String name = sc.next();
            int hp = sc.nextInt();
            int type = sc.nextInt();
            int att = sc.nextInt();
            int def_phy = sc.nextInt();
            int def_magic = sc.nextInt();
            if (tp == 1) {
                members[i] = new Carry(name, hp, type, att, def_phy, def_magic);
            } else if (tp == 2) {
                members[i] = new Fighter(name, hp, type, att, def_phy, def_magic);
            } else if (tp == 3) {
                members[i] = new Mage(name, hp, type, att, def_phy, def_magic);
            } else if (tp == 4) {
                members[i] = new Tank(name, hp, type, att, def_phy, def_magic);
            } else if (tp == 5) {
                members[i] = new Support(name, hp, type, att, def_phy, def_magic);
            } else if (tp == 6) {
                members[i] = new Assassin(name, hp, type, att, def_phy, def_magic);
            }
        }
        Team t = new Team(members);
        System.out.println(t.is5MemberTeam(members));
        System.out.println(t.isValid(members));
        System.out.println(t.isBalanced(members));
    }
}
