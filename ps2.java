// import java.util.Scanner;

//  Q1 write a java prog to encrpyt a grade by adding 8 to it . Decrypt it to show correct
public class ps2 {
    /*
     * public static void main(String[] args) {
     * char grade = 'B';
     * grade = (char) (grade + 8);
     * System.out.println(" The grade after encyting is " + grade);
     * // decryting the grade
     * grade = (char) (grade - 8);
     * System.out.println(" the correct grade is " + grade);
     * }
     */
    // -----------------------------------------------
    // Q2 compare the num entered by user is greater than given num
    // public static void main(String[] args) {
    // System.out.println("Enter the number a ");
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // System.out.println(a > 8);
    // sc.close();
    // }
    // -------------------------------------------------------------
    // Q3 print v^2 - u^2/2ac
    public static void main(String[] args) {
        int v = 4;
        int u = 2;
        int a = 2;
        int s = 1;
        int k = ((v ^ 2 - u ^2) / (2 * a * s));
        System.out.println(k);
    }
}
