import java.util.Scanner;

public class ps5 {
    public static void main(String[] args) {
        // q1------------------------------------------
        // int n = 6;
        // for (int i = n; i > 0; i--) {
        // for (int j = 0; j < i; j++) {

        // System.out.print("*");
        // }
        // System.out.print("\n");
        // }

        // q2------------------------------------------
        //
        // System.out.println("Enter num for print table ");
        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // for (int i = 1; i < 11; i++) {
        // System.out.printf("%d X %d = %d\n", n, i, n * i);
        // }
        // s.close();

        // q3------------------------------------------

        // System.out.println("Enter num for reverse print table ");
        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // for (int i = 10; i > 0; i--) {
        // System.out.printf("%d X %d = %d\n", n, i, n * i);
        // }
        // s.close();

        // q4------------------------------------------

        // System.out.println("Enter num for factorial ");
        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // int fact = 1;
        // for (int i = 1; i <= n; i++) {
        // fact *= i;
        // }
        // System.out.println(fact);
        // s.close();

        // q4------------------------------------------

        System.out.println("Enter num for print sum of  table ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += n * i;
        }
        System.out.println(sum);
        s.close();
    }
}
