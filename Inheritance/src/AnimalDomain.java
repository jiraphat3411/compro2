
import java.util.ArrayList;
import java.util.Scanner;

class Animal {

    String name;
    int lifeExpect;
    int age;

    Animal(String name, int lifeExpect) {
        this.name = name;
        this.lifeExpect = lifeExpect;
        this.age = 0;
        System.out.println(this.name + " was born with life expectancy " + this.lifeExpect + " year(s)");
    }

    void live(int year) {
        if (age == lifeExpect) {
            System.out.println(this.name + " died earlier");
        } else if (year + age < lifeExpect) {
            if (year == 1) {
                System.out.println(this.name + " lived " + year + " more year");
            } else {
                System.out.println(this.name + " lived " + year + " more years");
            }
            age += year;
        } else if (year + age == lifeExpect) {
            if (year == 1) {
                System.out.println(this.name + " lived " + year + " more year and died");
            } else {
                System.out.println(this.name + " lived " + year + " more years and died");
            }
            age += year;
        } else if (year + age > lifeExpect) {
            if ((lifeExpect - age) == 1) {
                System.out.println(this.name + " lived " + (lifeExpect - age) + " more year and died");
            } else {
                System.out.println(this.name + " lived " + (lifeExpect - age) + " more years and died");
            }
            age = lifeExpect;
        }
    }

    boolean isAlive() {
        boolean b;
        if (age == lifeExpect) {
            System.out.println(this.name + " is dead");
            b = false;
        } else {
            System.out.println(this.name + " is alive");
            b = true;
        }
        return b;
    }

    void vaccine() {
        //if ((lifeExpect - age) == 1) {
            //System.out.println(this.name + "'s life expectancy is now " + lifeExpect + " year");
        //} else {
            System.out.println(this.name + "'s life expectancy is now " + lifeExpect + " year(s)");
        //}
    }
}

class Dog extends Animal {

    int count = 0;

    Dog(String name) {
        super(name, 8);
    }

    @Override
    void vaccine() {
        if (count == 0) {
            count = 1;
            lifeExpect = ((lifeExpect - age)*2)+age;
        }
        super.vaccine();
    }
}

class Turtle extends Animal {

    Turtle(String name) {
        super(name, 50);
    }
}

class Salmon extends Animal {

    Salmon(String name) {
        super(name, 4);
    }
}

public class AnimalDomain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Animal> zoo = new ArrayList<Animal>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == 1) {
                int type = sc.nextInt();
                String name = sc.next();
                if (type == 1) {
                    zoo.add(new Dog(name));
                } else if (type == 2) {
                    zoo.add(new Turtle(name));
                } else if (type == 3) {
                    zoo.add(new Salmon(name));
                }
            } else if (num == 2) {
                int index = sc.nextInt() - 1;
                int year = sc.nextInt();
                zoo.get(index).live(year);
            } else if (num == 3) {
                int index = sc.nextInt() - 1;
                zoo.get(index).isAlive();
            } else if (num == 4) {
                int index = sc.nextInt() - 1;
                zoo.get(index).vaccine();
            }
        }
    }
}
