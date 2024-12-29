
import java.util.Scanner;

class Blade {

    int size;
    int number;
    int angle;
    double hp;
    boolean valid;

    Blade(int size, int number, int angle, double hp) {
        this.valid = true;
        this.size = size;
        if (size < 16 || size > 24||size%2!=0) {
            System.out.println("invalid size");
            this.valid = false;
        }
        this.number = number;
        if (number < 3 || number > 5) {
            System.out.println("invalid number of blades");
            this.valid = false;
        }
        this.angle = angle;
        if (angle != 27 && angle != 30 && angle != 33) {
            System.out.println("invalid angle");
            this.valid = false;
        }
        this.hp = hp;
        if (hp <= 0) {
            System.out.println("invalid horsepower");
            this.valid = false;
        }
    }

    void printInfo() {
        System.out.print(size + " ");
        System.out.print(number + " ");
        System.out.print(angle + " ");
        System.out.print(hp + " ");
        System.out.println(valid);
    }
}

class Motor {
    double V;
    double I;
    double Eff;
    Motor(double V,double I,double Eff){
        this.V = V;
        this.I = I;
        this.Eff = Eff/100;
    }
    Motor(double I,double Eff){
        this.V = 220;
        this.I = I;
        this.Eff = Eff/100;
    }
    double horsepowe(double V,double I,double Eff){
        double HP = (V*I*Eff)/746;
        return HP;
    }
    void printInfo(){
        System.out.print(V+" ");
        System.out.print(I+" ");
        System.out.print(Eff+" ");
        double HP = this.horsepowe(V, I, Eff);
        System.out.println(String.format("%.2f", HP));
    }
}

class ElectricFan {
    int productID = 0;
    Blade blade;
    Motor motor;
    boolean status;
    static int count = 0;
    ElectricFan(Blade blade,Motor motor){
        this.count++;
        this.productID = this.count;
        this.blade = blade;
        this.motor = motor;
        if(blade.hp<=motor.horsepowe(motor.V, motor.I, motor.Eff)){
            this.status = true;
        }else{
            this.status =false;
        }
    }
    boolean changeBlade(Blade blade){
        this.blade = blade;
        boolean b = blade.hp<=motor.horsepowe(motor.V, motor.I, motor.Eff);
        if(b){
            this.status = true;
        }else{
            this.status =false;
        }
        return b;
    }
    boolean changeMotor(Motor motor){
        this.motor = motor;
        boolean b = blade.hp<=motor.horsepowe(motor.V, motor.I, motor.Eff);
        if(b){
            this.status = true;
        }else{
            this.status =false;
        }
        return b;
    }
    void printInfo(){
        System.out.print(productID+" ");
        System.out.print(blade.size+" ");
        System.out.print(blade.hp+" ");
        System.out.print(motor.I+" ");
        System.out.print(String.format("%.2f",motor.horsepowe(motor.V,motor.I,motor.Eff))+" ");
        System.out.println(status);
        //System.out.println("count = "+count);
    }
}

public class FanCompany {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size,numb,angle;
        double hp,v,i,eff;
        Blade ablade = null;
        Motor motor = null;
        ElectricFan eFan= null;
        int n = sc.nextInt();
        for(int index=0;index<n;index++){
            int cmd = sc.nextInt();
            if(cmd==0){
                size = sc.nextInt();
                numb = sc.nextInt();
                angle = sc.nextInt();
                hp = sc.nextDouble();
                ablade = new Blade(size,numb,angle,hp);
                v = sc.nextDouble();
                i = sc.nextDouble();
                eff = sc.nextDouble();
                motor = new Motor(v,i,eff);
                eFan = new ElectricFan(ablade,motor);
            }else if(cmd==1){
                size = sc.nextInt();
                numb = sc.nextInt();
                angle = sc.nextInt();
                hp = sc.nextDouble();
                ablade = new Blade(size,numb,angle,hp);
                eFan.changeBlade(ablade);
            }else if(cmd==2){
                v = sc.nextDouble();
                i = sc.nextDouble();
                eff = sc.nextDouble();
                motor = new Motor(v,i,eff);
                eFan.changeMotor(motor);
            }
            eFan.printInfo();
        }
    }
}
