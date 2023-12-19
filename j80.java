import java.util.Scanner;

public class j80 {
    public static void main(String[] args) {
        int a = 6000;
        Scanner s = new Scanner(System.in);
        // int b = 0; // this is an artematic exception
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        int b = s.nextInt();
        // for solve this we wrap this in try
        try {
            int c = a / b;
            System.out.println("THE result is this " + c);
        } catch (Exception e) {
            System.out.println(" we failed to divide . REASON !");
            System.out.println(e);
        }

        System.out.println("END OF THE PROGRAM.......");
        s.close();
    }
}