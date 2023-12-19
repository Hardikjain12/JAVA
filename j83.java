import java.util.Scanner;

class myexception extends Exception {
    @Override

    public String toString() {
        return "I am toString() ";
    }

    @Override
    public String getMessage() {
        return "I am getMessage() ";
    }
}

class MaxageException extends Exception {
    @Override

    public String toString() {
        return " AGE CANNOT BE GREATER THAN 125 and  ";
    }

    @Override
    public String getMessage() {
        return "Make sure that the value of age entered is correct ";
    }
}

public class j83 {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        a = s.nextInt();
        if (a < 99) {
            try {
                // throw new myexception();
                throw new ArithmeticException("this is an exception ");
                

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("FINISHED......");
            }
            System.out.println(" yes  bro FINISHED......");
        }
        s.close();
    }
}
