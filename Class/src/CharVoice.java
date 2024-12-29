
import java.util.Scanner;

class Character {

    String[] dialogue;
    int index = 0;

    Character(String[] dialogue) {
        this.dialogue = dialogue;
    }

    void speak() {
        if (index == dialogue.length) {
            index = 0;
        }
        System.out.println(dialogue[index]);
        index++;
        
    }
}

public class CharVoice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int n = sc.nextInt();
        sc.nextLine();
        String[] msg = new String[n];
        for (int i = 0; i < n; i++) {
            msg[i] = sc.nextLine();
        }
        Character chr = new Character(msg);
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            chr.speak();
        }*/
        int N = sc.nextInt();
        Character[] chr = new  Character[N];
        for(int i = 0; i < N; i++){
            int n = sc.nextInt();
            sc.nextLine();
            String[] msg = new String[n];
            for (int j = 0; j < n; j++) {
                msg[j] = sc.nextLine();
            }
            chr[i] = new Character(msg);
        }
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            int index = sc.nextInt()-1;
            chr[index].speak();
        }
    }
}
/*
2 
3 
It i s Van Helsing time.
Just give up.
I did no t see that coming.
2 
Victory draws near. 
I stand by the light.
10
1 2 1 1 2 1 2 2 1 1
*/
