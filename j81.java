import java.util.Scanner;

public class j81 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 86;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array index ");
        int ind = s.nextInt();
        System.out.println("Enter the number u want to divide ");
        int num = s.nextInt();
        try {
            System.out.println("The value at array index entered is " + marks[ind]);
            System.out.println("the value of array-value is : " + marks[ind] / num);

        } catch (ArithmeticException e) {
            System.out.println("  ArithmeticException occured ");
            System.out.println(e);    
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("  ArrayIndexOutOfBoundsException occured ");
            System.out.println(e);
        }
         catch (Exception e) {
            System.out.println(" some other Exception  occured ");
            System.out.println(e);
        }
        s.close();
    }
}
