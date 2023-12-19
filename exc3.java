import java.util.Random;
import java.util.Scanner;

class Game {

    public int number;
    public int inputNumber;
    public int noofguess = 0;

    public int getNoofguess() {
        return noofguess;
    }

    public void setNoofguess(int noofguess) {
        this.noofguess = noofguess;
    }

    Game() {
        Random r = new Random();
        this.number = r.nextInt(100);
    }

    void userinput() {
        System.out.println(" Guess the no ");
        try (Scanner sc = new Scanner(System.in)) {
            inputNumber = sc.nextInt();
        }
        
    }

    boolean isCorrectnum() {
        noofguess++;
        if (inputNumber == number) {
            System.out.format("U hv guessed right , It was %d\n u guessed in %d attempts", number, noofguess);
            return true;
        }
         else if (inputNumber < number) {
            System.out.println("TWO loWWWWWWW ");
        }
         else if (inputNumber > number) {
            System.out.println("TWO HIGHHHHH ");
        }
        return false;
    }

}

public class exc3 {
    public static void main(String[] args) {
     
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.userinput();
            b = g.isCorrectnum();
        }
    }
}
