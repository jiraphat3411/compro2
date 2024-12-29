
import java.util.Scanner;

class CPU {

    String model;
    int clocks;
    int socket;
    int memType;
    boolean Spec;

    CPU(String model, int clocks, int socket, int memType) {
        this.model = model;
        this.clocks = clocks;
        this.socket = socket;
        this.memType = memType;
        this.Spec = this.isValidSpec(model, clocks, socket, memType);
    }

    boolean isValidSpec(String model, int clocks, int socket, int memType) {
        boolean b = model != null && model.length() > 0 && clocks > 0 && socket > 0 && memType > 0 && memType <= 10;
        return b;
    }

    void printInfo() {
        System.out.println(this.model);
        System.out.println(this.clocks);
        System.out.println(this.socket);
        System.out.println(this.memType);
        System.out.println(this.Spec);
    }
}

class MainBoard {

    String model;
    int socket;
    int memType;
    boolean Spec;

    MainBoard(String model, int socket, int memType) {
        this.model = model;
        this.socket = socket;
        this.memType = memType;
        this.Spec = this.isValidSpec(model, socket, memType);
    }

    boolean isValidSpec(String model, int socket, int memType) {
        boolean b = model != null && model.length() > 0 && socket > 0 && memType > 0 && memType <= 10;
        return b;
    }

    void printInfo() {
        System.out.println(this.model);
        System.out.println(this.socket);
        System.out.println(this.memType);
        System.out.println(this.Spec);
    }
}

class Computer {

    CPU cpu;
    MainBoard mb;
    boolean Spec;

    Computer(CPU cpu, MainBoard mb) {
        this.cpu = cpu;
        this.mb = mb;
        this.Spec = this.isValidCom(cpu, mb);
    }

    boolean isValidCom(CPU cpu, MainBoard mb) {
        boolean b = cpu.socket == mb.socket && cpu.memType == mb.memType && cpu.Spec == true && mb.Spec == true;
        return b;
    }

    void printInfo() {
        if (Spec) {
            System.out.println(this.cpu.model);
            System.out.println(this.cpu.clocks);
            System.out.println(this.mb.model);
            System.out.println(this.cpu.socket);
            System.out.println(this.cpu.memType);
        } else {
            System.out.println("Invalid Spec");
            this.cpu.printInfo();
            this.mb.printInfo();
        }
    }
}

public class CPUSpec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*String model = sc.nextLine();
        int clocks = sc.nextInt();
        int socket = sc.nextInt();
        int memType = sc.nextInt();
        if (model.length() == 0 && socket % 2 == 0) {
            model = null;
        }
        CPU cpu = new CPU(model, clocks, socket, memType);
        cpu.printInfo();*/
        String model = sc.nextLine();
        int clocks = sc.nextInt();
        int socket = sc.nextInt();
        int memType = sc.nextInt();
        if (model.length() == 0 && socket % 2 == 0) {
            model = null;
        }
        CPU cpu = new CPU(model, clocks, socket, memType);
        sc.nextLine();
        model = sc.nextLine();
        socket = sc.nextInt();
        memType = sc.nextInt();
        if (model.length() == 0 && socket % 2 == 0) {
            model = null;
        }
        MainBoard mb = new MainBoard(model, socket, memType);
        Computer com = new Computer(cpu, mb);
        com.printInfo();
    }
}
