import java.util.Scanner;
import java.util.Random;

public class exc2 {
    public static void main(String[] args) {
        // 0 for rock
        // 1 for paper
        // 2 for scissor

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter 0 for rock  , 1 for paper , 2 for sciisor");
        int userinput = sc.nextInt();

        Random rm = new Random();
        int computerinput = rm.nextInt(3);

        if (userinput == computerinput) {
            System.out.println(" Draw ");
        } else if (userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0
                || userinput == 2 && computerinput == 1) {
            System.out.println("U WIN");
        } else {
            System.out.println(" Computer Wins");
        }
        if (computerinput == 0) {
            System.out.println("Computer choice : Rock");
        } else if (computerinput == 1) {
            System.out.println("Computer choice : Paper");
        } else {
            System.out.println("Computer choice : Scissor");
        }
        sc.close();
    }
}
